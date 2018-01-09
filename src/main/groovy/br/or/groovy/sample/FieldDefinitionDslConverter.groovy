package br.or.groovy.sample

import groovy.transform.CompileStatic

@CompileStatic
class FieldDefinitionDslConverter {


    static FieldDefinitionDsl convert(File dsl) {
        Object object = groovyShell().evaluate(dsl)
        return [object] as FieldDefinitionDsl

    }

    static GroovyShell groovyShell() {
        return new GroovyShell(FieldDefinitionDslConverter.getClassLoader())
    }
}
