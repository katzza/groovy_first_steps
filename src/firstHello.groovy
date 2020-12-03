import groovy.json.JsonBuilder
import groovy.json.JsonSlurper

println "murr"


String jsonStr = '{"id": "111"}'
println new JsonBuilder(new JsonSlurper().parseText(jsonStr)).toPrettyString()
