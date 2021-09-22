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
        "September"| 0     | 15
        "October"  | 1     | 4
        "November" | 2     | 0
        "December" | 3     | 0
        "January"  | 4     | 0
        "February" | 5     | 0
        "March"    | 6     | 0
        "April"    | 7     | 0
    }

    @Unroll
    def "test Haven Hideaway nights #month"() throws IOException {
        ArrayList<Integer> counts = checkerService.retrieveRoomNights(Checker.HAVEN_HIDEAWAY)
        expect:
        counts.get(index) == bookings
        where:
        month      | index | bookings
        "September"| 0     | 11
        "October"  | 1     | 0
        "November" | 2     | 0
        "December" | 3     | 0
        "January"  | 4     | 0
        "February" | 5     | 0
        "March"    | 6     | 0
        "April"    | 7     | 0
    }
}
