class MappingRules(sAttributesNames: Array<String>,
                   tAttributesNames: Array<String>,
                   helper: MapHelper) {

    public var sourceAttributesName: Array<String>;
    public var targetAttributesName: Array<String>;
    public var helper: MapHelper

    init {
        this.sourceAttributesName = sAttributesNames
        this.targetAttributesName = tAttributesNames
        this.helper = helper
    }

    public fun apply(source: AttributeSet, target: AttributeSet): Boolean {
        if(!canApplyRulesOnSource(source, sourceAttributesName)) {
            return false;
        }
        return helper.process(source, target, sourceAttributesName, targetAttributesName);
    }

    private fun canApplyRulesOnSource(source: AttributeSet, sourceAttributesName: Array<String>): Boolean {
        for(i in 0..(sourceAttributesName.size - 1)) {
            if(!source.hasAttribute(sourceAttributesName[i])) return false;
        }
        return true;
    }
}