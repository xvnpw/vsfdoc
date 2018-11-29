package com.bottega.vsfdoc.draft.write.domain;

enum QDocState {

	NEW, IN_VERIFICATION, VERIFIED, PUBLISHED;

	public boolean isNew() {
		return this.equals(NEW);
	}
}
