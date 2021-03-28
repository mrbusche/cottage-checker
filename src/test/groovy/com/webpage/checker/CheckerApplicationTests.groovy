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

    def "test Haven Hideaway reviews"() throws IOException {
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
        "March"    | 0     | 3
        "April"    | 1     | 0
        "May"      | 2     | 5
        "June"     | 3     | 3
        "July"     | 4     | 26
        "August"   | 5     | 18
        "September"| 6     | 0
        "October"  | 7     | 0
    }

    @Unroll
    def "test Haven Hideaway nights #month"() throws IOException {
        ArrayList<Integer> counts = checkerService.retrieveRoomNights(Checker.HAVEN_HIDEAWAY)
        expect:
        counts.get(index) == bookings
        where:
        month      | index | bookings
        "March"    | 0     | 3
        "April"    | 1     | 0
        "May"      | 2     | 5
        "June"     | 3     | 0
        "July"     | 4     | 24
        "August"   | 5     | 14
        "September"| 6     | 0
        "October"  | 7     | 0
    }
}
