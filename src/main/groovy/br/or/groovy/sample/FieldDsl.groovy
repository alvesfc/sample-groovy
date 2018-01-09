package br.or.groovy.sample

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TypeChecked

@TypeChecked
@EqualsAndHashCode
@ToString(includePackage = false, includeNames = true)
class FieldDsl {

    String pattern
    String description
    String[] samples


    FieldDsl() {
    }

    FieldDsl(FieldDsl dsl) {
        this.pattern = dsl.pattern
        this.description = dsl.description
        this.samples = dsl.samples
    }

    static FieldDsl make(@DelegatesTo(FieldDsl) Closure closure) {
        FieldDsl dsl = new FieldDsl()
        closure.delegate = dsl
        closure()
        return dsl
    }

    def pattern(String pattern) {
        this.pattern = pattern
    }

    def description(String description) {
        this.description = description
    }

    def samples(String... samples) {
        this.samples = samples
    }

}
