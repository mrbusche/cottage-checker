package com.webpage.checker

import spock.lang.Specification
import spock.lang.Unroll

class CheckerApplicationTests extends Specification {
    CheckerService checkerService = new CheckerService()

    def "test Cozy Cottage reviews"() throws IOException {
        when:
        int reviewCount = checkerService.retrieveReviewCount(Checker.COZY_COTTAGE)
        then:
        reviewCount == 14
    }

    def "test Haven Hideaway2 bedroom reviews"() throws IOException {
        when:
        int reviewCount = checkerService.retrieveReviewCount(Checker.HAVEN_HIDEAWAY)
        then:
        reviewCount == 8
    }

    @Unroll
    def "test Cozy Cottage nights #month"() throws IOException {
        ArrayList<Integer> counts = checkerService.retrieveRoomNights(Checker.COZY_COTTAGE)
        expect:
        counts.get(index) == bookings
        where:
        month      | index | bookings
        "February" | 0     | 3
        "March"    | 1     | 0
        "April"    | 2     | 0
        "May"      | 3     | 5
        "June"     | 4     | 3
        "July"     | 5     | 14
        "August"   | 6     | 14
        "September"| 7     | 0
    }

    @Unroll
    def "test Haven Hideaway nights #month"() throws IOException {
        ArrayList<Integer> counts = checkerService.retrieveRoomNights(Checker.HAVEN_HIDEAWAY)
        expect:
        counts.get(index) == bookings
        where:
        month      | index | bookings
        "February" | 0     | 0
        "March"    | 1     | 0
        "April"    | 2     | 0
        "May"      | 3     | 5
        "June"     | 4     | 0
        "July"     | 5     | 20
        "August"   | 6     | 7
        "September"| 7     | 0
    }
}
