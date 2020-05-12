interface MapHelper {
    fun process(source: AttributeSet,
                target: AttributeSet,
                sourceAttributeNames: Array<String>,
                targetAttributeNames: Array<String>): Boolean
}