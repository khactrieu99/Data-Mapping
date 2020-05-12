class AttributeSet {
    public var attributes: Map<String, Any> = mapOf<String, Any>();

    constructor() {}

    operator fun get(attribute: String): Any? {
        if(attributes.containsKey(attribute)) {
            return attributes.get(attribute);
        }
        return null;
    }

    operator fun set(attribute: String, value: Any) {
        attributes = attributes.plus(Pair(attribute, value));
    }

    public fun hasAttribute(attribute: String): Boolean {
        return attributes.containsKey(attribute);
    }
}