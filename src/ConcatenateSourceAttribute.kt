class ConcatenateSourceAttribute: MapHelper {
    override fun process(source: AttributeSet,
                         target: AttributeSet,
                         sourceAttributeNames: Array<String>,
                         targetAttributeNames: Array<String>): Boolean {

        var s: String = ""

        for(i in 0..(sourceAttributeNames.size - 1)) {
            s = s + source[sourceAttributeNames[i]] + " "
        }

        target[targetAttributeNames[0]] = s
        return true;
    }
}