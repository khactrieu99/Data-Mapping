fun main(args: Array<String>) {
        var student: Entity = Entity()
        var sv: Entity = Entity()

        student["first name"] = "Trieu"
        student["last name"] = "Truong-Khac"
        student["id"] = 1712838
        student["GPA"] = 8.5

        val rule_name: MappingRules = MappingRules(arrayOf("first name", "last name"),
                                                   arrayOf("ten"),
                                                   ConcatenateSourceAttribute())
        val rule_id: MappingRules = MappingRules(arrayOf("id"),
                                                 arrayOf("mssv"),
                                                 CopyStringValue())
        val rule_gpa: MappingRules = MappingRules(arrayOf("GPA"),
                                                  arrayOf("diem trung binh"),
                                                  CopyStringValue())

        var rules: List<MappingRules> = listOf(rule_name, rule_id, rule_gpa)

        sv.getDataFromOtherEntityWithAllPossibleRules(student, rules)

        println(sv["ten"])
        println(sv["mssv"])
        println(sv["diem trung binh"])
}
