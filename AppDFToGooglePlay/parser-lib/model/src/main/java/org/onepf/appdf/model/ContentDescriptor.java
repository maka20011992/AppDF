/*******************************************************************************
 * Copyright 2012 One Platform Foundation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.onepf.appdf.model;

public class ContentDescriptor {

    public enum DescriptorValue {
        NO, LIGHT, STRONG
    }

   
    private DescriptorValue cartoonViolence;

    private DescriptorValue realisticViolence;

    private DescriptorValue badLanguage;

    private DescriptorValue fear;

    private DescriptorValue sexualContent;

    private DescriptorValue drugs;

    //gambling-reference
    private DescriptorValue gamblingReference;

    private DescriptorValue alcohol;

    private DescriptorValue smoking;

    private DescriptorValue discrimination;

    public DescriptorValue getCartoonViolence() {
        return cartoonViolence;
    }

    public void setCartoonViolence(DescriptorValue cartoonViolence) {
        this.cartoonViolence = cartoonViolence;
    }

    public DescriptorValue getRealisticViolence() {
        return realisticViolence;
    }

    public void setRealisticViolence(DescriptorValue realisticViolence) {
        this.realisticViolence = realisticViolence;
    }

    public DescriptorValue getBadLanguage() {
        return badLanguage;
    }

    public void setBadLanguage(DescriptorValue badLanguage) {
        this.badLanguage = badLanguage;
    }

    public DescriptorValue getFear() {
        return fear;
    }

    public void setFear(DescriptorValue fear) {
        this.fear = fear;
    }

    public DescriptorValue getSexualContent() {
        return sexualContent;
    }

    public void setSexualContent(DescriptorValue sexualContent) {
        this.sexualContent = sexualContent;
    }

    public DescriptorValue getDrugs() {
        return drugs;
    }

    public void setDrugs(DescriptorValue drugs) {
        this.drugs = drugs;
    }

    public DescriptorValue getGamblingReference() {
        return gamblingReference;
    }

    public void setGamblingReference(DescriptorValue gamblingReference) {
        this.gamblingReference = gamblingReference;
    }

    public DescriptorValue getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(DescriptorValue alcohol) {
        this.alcohol = alcohol;
    }

    public DescriptorValue getSmoking() {
        return smoking;
    }

    public void setSmoking(DescriptorValue smoking) {
        this.smoking = smoking;
    }

    public DescriptorValue getDiscrimination() {
        return discrimination;
    }

    public void setDiscrimination(DescriptorValue discrimination) {
        this.discrimination = discrimination;
    }

    @Override
    public String toString() {
        return "ContentDescriptor [cartoonViolence=" + cartoonViolence
                + ", realisticViolence=" + realisticViolence + ", badLanguage="
                + badLanguage + ", fear=" + fear + ", sexualContent="
                + sexualContent + ", drugs=" + drugs + ", gamblingReference="
                + gamblingReference + ", alcohol=" + alcohol + ", smoking="
                + smoking + ", discrimination=" + discrimination + "]";
    }
}
