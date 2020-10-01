package com.webpage.checker

import spock.lang.Specification
import spock.lang.Unroll

class CheckerApplicationTests extends Specification {
    CheckerService checkerService = new CheckerService()

    def "test 3 bedroom reviews"() throws IOException {
        when:
        int reviewCount = checkerService.retrieveReviewCount(Checker.THREE_BEDROOM)
        then:
        reviewCount == 13
    }

    def "test 2 bedroom reviews"() throws IOException {
        when:
        int reviewCount = checkerService.retrieveReviewCount(Checker.TWO_BEDROOM)
        then:
        reviewCount == 6
    }

    @Unroll
    def "test 3 bedroom nights #month"() throws IOException {
        ArrayList<Integer> counts = checkerService.retrieveRoomNights(Checker.THREE_BEDROOM)
        expect:
        counts.get(index) == val
        where:
        month       | index | val
        "October"   | 0     | 11
        "November"  | 1     | 0
        "December"  | 2     | 0
        "January"   | 3     | 0
        "February"  | 4     | 0
        "March"     | 5     | 0
        "April"     | 6     | 0
        "May"       | 7     | 0
    }

    @Unroll
    def "test 2 bedroom nights #month"() throws IOException {
        ArrayList<Integer> counts = checkerService.retrieveRoomNights(Checker.TWO_BEDROOM);
        expect:
        counts.get(index) == val
        where:
        month       | index | val
        "October"   | 0     | 9
        "November"  | 1     | 0
        "December"  | 2     | 0
        "January"   | 3     | 0
        "February"  | 4     | 0
        "March"     | 5     | 0
        "April"     | 6     | 0
        "September" | 7     | 0
    }
}
