package org.postagging.postaggers.crf;


import java.util.Set;

import org.postagging.crf.features.CrfFilteredFeature;
import org.postagging.data.InMemoryPosTagCorpus;

/**
 * Generates set of features to be used by the CRF algorithm for training and inference of {@link CrfPosTagger}.
 * 
 * @author Asher Stern
 * Date: Nov 10, 2014
 *
 */
public abstract class CrfPosTaggerFeatureGenerator
{
	public CrfPosTaggerFeatureGenerator(InMemoryPosTagCorpus<String, String> corpus, Set<String> tags)
	{
		super();
		this.corpus = corpus;
		this.tags = tags;
	}
	
	/**
	 * Generate the features (to be lated retrieved by {@link #getFeatures()}).
	 */
	public abstract void generateFeatures();
	
	/**
	 * Return the set of features earlier generated by {@link #generateFeatures()}.
	 * @return the set of features earlier generated by {@link #generateFeatures()}.
	 */
	public abstract Set<CrfFilteredFeature<String, String>> getFeatures();

	
	
	protected final InMemoryPosTagCorpus<String, String> corpus;
	protected final Set<String> tags;
}
