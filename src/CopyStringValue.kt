class CopyStringValue: MapHelper {
    override fun process(source: AttributeSet,
                         target: AttributeSet,
                         sourceAttributeNames: Array<String>,
                         targetAttributeNames: Array<String>): Boolean {
        target[targetAttributeNames[0]] = source[sourceAttributeNames[0]]!!
        return true;
    }
}