package com.waiyanhtet.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Feature implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "feature_name")
	private String featureName;

	@Column(name = "feature_effect")
	private String featureEffect;

	public String getFeatureName() {
		return featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	public String getFeatureEffect() {
		return featureEffect;
	}

	public void setFeatureEffect(String featureEffect) {
		this.featureEffect = featureEffect;
	}

}
