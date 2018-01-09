package br.or.groovy.sample

class TestMain {


    static void main(String[] args) {
        //Success Field
        FieldDsl.make {
            pattern 'Pattern do  Campo de Sucesso'
            description 'Descrição do Camo de Sucesso'
            samples 'Sucesso3', 'Sucesso2', 'Sucesso1'
        }

        //Fail Field
        FieldDsl.make {
            pattern 'Pattern do  Campo de Falha'
            description 'Descriçãodo Camo de Falha'
            samples 'Falha1', 'Falha2', 'Falha3'
        }

        FieldDefinitionDsl dsl = FieldDefinitionDslConverter.convert(new File("dsl.groovy"))

        println dsl.name


    }
}
