package json

import groovy.json.JsonSlurper

//Json parse
String jsonTxt = new File('../../resources/people.json').text
println jsonTxt
def json = new JsonSlurper().parseText(jsonTxt)
println json.class.name
println json
assert json[1].role == 'witch'