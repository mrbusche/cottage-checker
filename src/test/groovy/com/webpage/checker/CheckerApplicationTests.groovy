package com.webpage.checker

import spock.lang.Specification
import spock.lang.Unroll

class CheckerApplicationTests extends Specification {
    CheckerService checkerService = new CheckerService()

    def "test Cozy Cottage reviews"() throws IOException {
        when:
        int reviewCount = checkerService.retrieveReviewCount(Checker.COZY_COTTAGE)
        then:
        reviewCount == 25
    }

    def "test Haven Hideaway reviews"() throws IOException {
        when:
        int reviewCount = checkerService.retrieveReviewCount(Checker.HAVEN_HIDEAWAY)
        then:
        reviewCount == 11
    }

    @Unroll
    def "test Cozy Cottage nights #month"() throws IOException {
        ArrayList<Integer> counts = checkerService.retrieveRoomNights(Checker.COZY_COTTAGE)
        expect:
        counts.get(index) == bookings
        where:
        month      | index | bookings
        "January"  | 0     | 30
        "February" | 1     | 27
        "March"    | 2     | 30
        "April"    | 3     | 29
        "May"      | 4     | 3
        "June"     | 5     | 4
        "July"     | 6     | 11
        "August"   | 7     | 13
    }

    @Unroll
    def "test Haven Hideaway nights #month"() throws IOException {
        ArrayList<Integer> counts = checkerService.retrieveRoomNights(Checker.HAVEN_HIDEAWAY)
        expect:
        counts.get(index) == bookings
        where:
        month      | index | bookings
        "January"  | 0     | 0
        "February" | 1     | 2
        "March"    | 2     | 0
        "April"    | 3     | 0
        "May"      | 4     | 3
        "June"     | 5     | 0
        "July"     | 6     | 15
        "August"   | 7     | 10
    }
}
