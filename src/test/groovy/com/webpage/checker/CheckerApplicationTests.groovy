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
        "January"  | 0     | 0
        "February" | 1     | 3
        "March"    | 2     | 0
        "April"    | 3     | 0
        "May"      | 4     | 5
        "June"     | 5     | 3
        "July"     | 6     | 9
        "August"   | 7     | 2
    }

    @Unroll
    def "test Haven Hideaway nights #month"() throws IOException {
        ArrayList<Integer> counts = checkerService.retrieveRoomNights(Checker.HAVEN_HIDEAWAY)
        expect:
        counts.get(index) == bookings
        where:
        month      | index | bookings
        "January"  | 0     | 0
        "February" | 1     | 0
        "March"    | 2     | 0
        "April"    | 3     | 0
        "May"      | 4     | 5
        "June"     | 5     | 0
        "July"     | 6     | 6
        "August"   | 7     | 2
    }
}
