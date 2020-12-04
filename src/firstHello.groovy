import groovy.json.JsonBuilder
import groovy.json.JsonSlurper

//how to create groovy project in Idea   https://www.logicbig.com/tutorials/misc/groovy/intellij.html


println "murr"


String jsonStr = '{"target":{"ciDescriptor":{"type":"Subscription","localId":"keinFehlerErkannt","ngssmDomain":"smk"}}}'
def slurper = new JsonSlurper().parseText(jsonStr)
def localId = slurper.target.ciDescriptor.localId    //чтобы вытащить зачение нижнего уровня, нужно упомянуть все узлы
//println(localId)
String path
switch (localId) {
    case ("keinFehlerErkannt"):
        path = 'C:/Users/emokeeva/Documents/Soap_ui_projects/messages/keinFehlerErkannt.txt'
        break
    case ("fehlerLinientechnik"):
        path = 'C:/Users/emokeeva/Documents/Soap_ui_projects/messages/fehlerLinientechnik.txt'
        break
    case ("fehlerTechnik"):
        path = 'C:/Users/emokeeva/Documents/Soap_ui_projects/messages/fehlerTechnik.txt'
        break
    default: println(3)
}
println(path)

/*def jsonS = new JsonBuilder(new JsonSlurper().parseText(jsonStr)).toPrettyString()

println(localId)*/

