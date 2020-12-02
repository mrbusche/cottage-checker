package com.webpage.checker

import spock.lang.Specification
import spock.lang.Unroll

class CheckerApplicationTests extends Specification {
    CheckerService checkerService = new CheckerService()

    def "test 3 bedroom reviews"() throws IOException {
        when:
        int reviewCount = checkerService.retrieveReviewCount(Checker.THREE_BEDROOM)
        then:
        reviewCount == 14
    }

    def "test 2 bedroom reviews"() throws IOException {
        when:
        int reviewCount = checkerService.retrieveReviewCount(Checker.TWO_BEDROOM)
        then:
        reviewCount == 8
    }

    @Unroll
    def "test 3 bedroom nights #month"() throws IOException {
        ArrayList<Integer> counts = checkerService.retrieveRoomNights(Checker.THREE_BEDROOM)
        expect:
        counts.get(index) == bookings
        where:
        month      | index | bookings
        "December" | 0     | 4
        "January"  | 1     | 0
        "February" | 2     | 0
        "March"    | 3     | 0
        "April"    | 4     | 0
        "May"      | 5     | 0
        "June"     | 6     | 0
        "July"     | 7     | 7
    }

    @Unroll
    def "test 2 bedroom nights #month"() throws IOException {
        ArrayList<Integer> counts = checkerService.retrieveRoomNights(Checker.TWO_BEDROOM)
        expect:
        counts.get(index) == bookings
        where:
        month      | index | bookings
        "December" | 0     | 4
        "January"  | 1     | 0
        "February" | 2     | 0
        "March"    | 3     | 0
        "April"    | 4     | 0
        "May"      | 5     | 0
        "June"     | 6     | 0
        "July"     | 7     | 0
    }
}
