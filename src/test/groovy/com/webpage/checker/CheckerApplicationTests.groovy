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
        "December" | 0     | 30
        "January"  | 1     | 30
        "February" | 2     | 27
        "March"    | 3     | 30
        "April"    | 4     | 29
        "May"      | 5     | 0
        "June"     | 6     | 0
        "July"     | 7     | 11
    }

    @Unroll
    def "test Haven Hideaway nights #month"() throws IOException {
        ArrayList<Integer> counts = checkerService.retrieveRoomNights(Checker.HAVEN_HIDEAWAY)
        expect:
        counts.get(index) == bookings
        where:
        month      | index | bookings
        "December" | 0     | 0
        "January"  | 1     | 0
        "February" | 2     | 2
        "March"    | 3     | 0
        "April"    | 4     | 0
        "May"      | 5     | 0
        "June"     | 6     | 0
        "July"     | 7     | 15
    }
}
