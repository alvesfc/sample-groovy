package br.or.groovy.sample

FieldDefinitionDsl.make {
    name 'Field-A'
    mandatory false
    success {
        pattern 'Pattern do  Campo de Sucesso'
        description 'Descriçãodo Camo de Sucesso'
        samples 'Sucesso3', 'Sucesso2', 'Sucesso1'
    }
    fail {
        pattern 'Pattern do  Campo de Falha'
        description 'Descriçãodo Camo de Falha'
        samples 'Falha1', 'Falha2', 'Falha3'
    }
}