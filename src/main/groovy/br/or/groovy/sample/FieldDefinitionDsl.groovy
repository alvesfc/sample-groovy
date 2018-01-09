package br.or.groovy.sample

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TypeChecked

@TypeChecked
@EqualsAndHashCode
@ToString(includePackage = false, includeNames = true)
class FieldDefinitionDsl {

    String name
    boolean mandatory
    FieldDsl success
    FieldDsl fail

    FieldDefinitionDsl() {
    }

    FieldDefinitionDsl(FieldDefinitionDsl dsl) {
        this.name = dsl.name
        this.mandatory = dsl.mandatory
        this.success = dsl.success
        this.fail = dsl.fail
    }

    static FieldDefinitionDsl make(@DelegatesTo(FieldDefinitionDsl) Closure closure) {
        FieldDefinitionDsl dsl = new FieldDefinitionDsl()
        closure.delegate = dsl
        closure()
        return dsl
    }

    def name(String name) {
        this.name = name
    }

    def mandatory(boolean mandatory) {
        this.mandatory = mandatory
    }

    def success(@DelegatesTo(FieldDsl) Closure closure) {
        this.success  = new FieldDsl()
        closure.delegate = this.success
        closure()
    }

    def fail(@DelegatesTo(FieldDsl) Closure closure) {
        this.fail  = new FieldDsl()
        closure.delegate = this.fail
        closure()
    }
}
