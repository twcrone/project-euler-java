package com.twcrone.projecteuler.solution

import spock.lang.Specification

class MultiplesOfThreeAndFiveSpec extends Specification {
    def "sum multiples less than 10 should be 23"() {
        setup:
        def app = new MultiplesOfThreeAndFive()

        when:
        def result = app.solveFor(10)

        then:
        result == 23
    }
}