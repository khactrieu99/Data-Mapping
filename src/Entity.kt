class Entity {
    private var attributes: AttributeSet = AttributeSet();

    operator fun get(attribute: String): Any? {
        return attributes[attribute];
    }

    operator fun set(attribute: String, value: Any) {
        attributes[attribute] = value;
    }

    public fun getDataFromOtherEntityWithAllPossibleRules(source: Entity, rules: List<MappingRules>) {
        for (rule: MappingRules in rules) {
            rule.apply(source.attributes, this.attributes);
        }
    }
}