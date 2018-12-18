package com.google.location.lbs.asn1.supl2.rrlp_components;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1Integer;
import com.google.location.lbs.asn1.base.Asn1Null;
import com.google.location.lbs.asn1.base.Asn1Object;
import com.google.location.lbs.asn1.base.Asn1Sequence;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.location.lbs.asn1.base.SequenceComponent;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class GANSSDeltaEpochHeader extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GANSSDeltaEpochHeader
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSDeltaEpochHeader() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSDeltaEpochHeader;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSDeltaEpochHeader != null) {
      return ImmutableList.of(TAG_GANSSDeltaEpochHeader);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSDeltaEpochHeader from encoded stream.
   */
  public static GANSSDeltaEpochHeader fromPerUnaligned(byte[] encodedBytes) {
    GANSSDeltaEpochHeader result = new GANSSDeltaEpochHeader();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSDeltaEpochHeader from encoded stream.
   */
  public static GANSSDeltaEpochHeader fromPerAligned(byte[] encodedBytes) {
    GANSSDeltaEpochHeader result = new GANSSDeltaEpochHeader();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }



  @Override protected boolean isExtensible() {
    return true;
  }

  @Override public boolean containsExtensionValues() {
    for (SequenceComponent extensionComponent : getExtensionComponents()) {
      if (extensionComponent.isExplicitlySet()) return true;
    }
    return false;
  }

  
  private GANSSDeltaEpochHeader.validityPeriodType validityPeriod_;
  public GANSSDeltaEpochHeader.validityPeriodType getValidityPeriod() {
    return validityPeriod_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSDeltaEpochHeader.validityPeriodType
   */
  public void setValidityPeriod(Asn1Object value) {
    this.validityPeriod_ = (GANSSDeltaEpochHeader.validityPeriodType) value;
  }
  public GANSSDeltaEpochHeader.validityPeriodType setValidityPeriodToNewInstance() {
    validityPeriod_ = new GANSSDeltaEpochHeader.validityPeriodType();
    return validityPeriod_;
  }
  
  private GANSSEphemerisDeltaBitSizes ephemerisDeltaSizes_;
  public GANSSEphemerisDeltaBitSizes getEphemerisDeltaSizes() {
    return ephemerisDeltaSizes_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSEphemerisDeltaBitSizes
   */
  public void setEphemerisDeltaSizes(Asn1Object value) {
    this.ephemerisDeltaSizes_ = (GANSSEphemerisDeltaBitSizes) value;
  }
  public GANSSEphemerisDeltaBitSizes setEphemerisDeltaSizesToNewInstance() {
    ephemerisDeltaSizes_ = new GANSSEphemerisDeltaBitSizes();
    return ephemerisDeltaSizes_;
  }
  
  private GANSSEphemerisDeltaScales ephemerisDeltaScales_;
  public GANSSEphemerisDeltaScales getEphemerisDeltaScales() {
    return ephemerisDeltaScales_;
  }
  /**
   * @throws ClassCastException if value is not a GANSSEphemerisDeltaScales
   */
  public void setEphemerisDeltaScales(Asn1Object value) {
    this.ephemerisDeltaScales_ = (GANSSEphemerisDeltaScales) value;
  }
  public GANSSEphemerisDeltaScales setEphemerisDeltaScalesToNewInstance() {
    ephemerisDeltaScales_ = new GANSSEphemerisDeltaScales();
    return ephemerisDeltaScales_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getValidityPeriod() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getValidityPeriod();
          }

          @Override public void setToNewInstance() {
            setValidityPeriodToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSDeltaEpochHeader.validityPeriodType.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "validityPeriod : "
                    + getValidityPeriod().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getEphemerisDeltaSizes() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemerisDeltaSizes();
          }

          @Override public void setToNewInstance() {
            setEphemerisDeltaSizesToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSEphemerisDeltaBitSizes.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "ephemerisDeltaSizes : "
                    + getEphemerisDeltaSizes().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getEphemerisDeltaScales() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getEphemerisDeltaScales();
          }

          @Override public void setToNewInstance() {
            setEphemerisDeltaScalesToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GANSSEphemerisDeltaScales.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "ephemerisDeltaScales : "
                    + getEphemerisDeltaScales().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
    }

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class validityPeriodType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_validityPeriodType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public validityPeriodType() {
    super();
    setValueRange(new java.math.BigInteger("1"), new java.math.BigInteger("8"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_validityPeriodType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_validityPeriodType != null) {
      return ImmutableList.of(TAG_validityPeriodType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new validityPeriodType from encoded stream.
   */
  public static validityPeriodType fromPerUnaligned(byte[] encodedBytes) {
    validityPeriodType result = new validityPeriodType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new validityPeriodType from encoded stream.
   */
  public static validityPeriodType fromPerAligned(byte[] encodedBytes) {
    validityPeriodType result = new validityPeriodType();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return super.encodePerUnaligned();
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return super.encodePerAligned();
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    super.decodePerUnaligned(reader);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    super.decodePerAligned(reader);
  }

  @Override public String toString() {
    return toIndentedString("");
  }

  public String toIndentedString(String indent) {
    return "validityPeriodType = " + getInteger() + ";\n";
  }
}

  
  
  
  
  

    

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return super.encodePerUnaligned();
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return super.encodePerAligned();
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    super.decodePerUnaligned(reader);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    super.decodePerAligned(reader);
  }

  @Override public String toString() {
    return toIndentedString("");
  }

  public String toIndentedString(String indent) {
    StringBuilder builder = new StringBuilder();
    builder.append("GANSSDeltaEpochHeader = {\n");
    final String internalIndent = indent + "  ";
    for (SequenceComponent component : getComponents()) {
      if (component.isExplicitlySet()) {
        builder.append(internalIndent)
            .append(component.toIndentedString(internalIndent));
      }
    }
    if (isExtensible()) {
      builder.append(internalIndent).append("...\n");
      for (SequenceComponent component : getExtensionComponents()) {
        if (component.isExplicitlySet()) {
          builder.append(internalIndent)
              .append(component.toIndentedString(internalIndent));
        }
      }
    }
    builder.append(indent).append("};\n");
    return builder.toString();
  }
}
