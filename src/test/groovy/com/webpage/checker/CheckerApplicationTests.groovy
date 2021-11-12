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
        "November" | 0     | 29
        "December" | 1     | 31
        "January"  | 2     | 31
        "February" | 3     | 28
        "March"    | 4     | 31
        "April"    | 5     | 30
        "May"      | 6     | 0
        "June"     | 6     | 0
    }

    @Unroll
    def "test Haven Hideaway nights #month"() throws IOException {
        ArrayList<Integer> counts = checkerService.retrieveRoomNights(Checker.HAVEN_HIDEAWAY)
        expect:
        counts.get(index) == bookings
        where:
        month      | index | bookings
        "November" | 0     | 0
        "December" | 1     | 0
        "January"  | 2     | 0
        "February" | 3     | 0
        "March"    | 4     | 0
        "April"    | 5     | 0
        "May"      | 6     | 0
        "June"     | 6     | 0
    }
}
