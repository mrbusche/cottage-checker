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
        "February" | 0     | 27
        "March"    | 1     | 30
        "April"    | 2     | 29
        "May"      | 3     | 3
        "June"     | 4     | 12
        "July"     | 5     | 23
        "August"   | 6     | 13
        "August"   | 7     | 0
    }

    @Unroll
    def "test Haven Hideaway nights #month"() throws IOException {
        ArrayList<Integer> counts = checkerService.retrieveRoomNights(Checker.HAVEN_HIDEAWAY)
        expect:
        counts.get(index) == bookings
        where:
        month      | index | bookings
        "February" | 0     | 2
        "March"    | 1     | 0
        "April"    | 2     | 0
        "May"      | 3     | 3
        "June"     | 4     | 0
        "July"     | 5     | 15
        "August"   | 6     | 14
        "August"   | 7     | 5
    }
}
