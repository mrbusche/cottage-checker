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
        "September" | 0     | 13
        "October"   | 1     | 11
        "November"  | 2     | 0
        "December"  | 3     | 0
        "January"   | 4     | 0
        "February"  | 5     | 0
        "March"     | 6     | 0
        "April"     | 7     | 0
    }

    @Unroll
    def "test 2 bedroom nights #month"() throws IOException {
        ArrayList<Integer> counts = checkerService.retrieveRoomNights(Checker.TWO_BEDROOM);
        expect:
        counts.get(index) == val
        where:
        month       | index | val
        "September" | 0     | 15
        "October"   | 1     | 9
        "November"  | 2     | 0
        "December"  | 3     | 0
        "January"   | 4     | 0
        "February"  | 5     | 0
        "March"     | 6     | 0
        "April"     | 7     | 0
    }
}
