package xml

def root = new XmlSlurper().parse('../../resources/people.xml')
println "the second name is ${root.person[1].name}"
println "the second name is ${root.person[1].@id}"

