package org.kew.stringmod.lib.transformers.collations.ipni;

import org.kew.stringmod.lib.transformers.Transformer;
import org.kew.stringmod.utils.LibraryRegister;

@LibraryRegister(category="transformers")
public class TabOrFigExtractorTransformer implements Transformer{

	@Override
	public String transform(String s) {
		String[] collationElements = CollationUtils.parseCollation(s);
		return collationElements[CollationUtils.TAB_OR_FIG_INDEX];
	}
}