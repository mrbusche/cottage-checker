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
        "October"  | 0     | 1
        "November" | 1     | 0
        "December" | 2     | 0
        "January"  | 3     | 0
        "February" | 4     | 0
        "March"    | 5     | 0
        "April"    | 6     | 0
        "May"      | 7     | 0
    }

    @Unroll
    def "test Haven Hideaway nights #month"() throws IOException {
        ArrayList<Integer> counts = checkerService.retrieveRoomNights(Checker.HAVEN_HIDEAWAY)
        expect:
        counts.get(index) == bookings
        where:
        month      | index | bookings
        "October"  | 0     | 2
        "November" | 1     | 0
        "December" | 2     | 0
        "January"  | 3     | 0
        "February" | 4     | 0
        "March"    | 5     | 0
        "April"    | 6     | 0
        "May"      | 7     | 0
    }
}
