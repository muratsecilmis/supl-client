package com.google.location.lbs.asn1.supl2.lpp;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1Boolean;
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
public  class OTDOA_RequestLocationInformation extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_OTDOA_RequestLocationInformation
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public OTDOA_RequestLocationInformation() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_OTDOA_RequestLocationInformation;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_OTDOA_RequestLocationInformation != null) {
      return ImmutableList.of(TAG_OTDOA_RequestLocationInformation);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new OTDOA_RequestLocationInformation from encoded stream.
   */
  public static OTDOA_RequestLocationInformation fromPerUnaligned(byte[] encodedBytes) {
    OTDOA_RequestLocationInformation result = new OTDOA_RequestLocationInformation();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new OTDOA_RequestLocationInformation from encoded stream.
   */
  public static OTDOA_RequestLocationInformation fromPerAligned(byte[] encodedBytes) {
    OTDOA_RequestLocationInformation result = new OTDOA_RequestLocationInformation();
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

  
  private OTDOA_RequestLocationInformation.assistanceAvailabilityType assistanceAvailability_;
  public OTDOA_RequestLocationInformation.assistanceAvailabilityType getAssistanceAvailability() {
    return assistanceAvailability_;
  }
  /**
   * @throws ClassCastException if value is not a OTDOA_RequestLocationInformation.assistanceAvailabilityType
   */
  public void setAssistanceAvailability(Asn1Object value) {
    this.assistanceAvailability_ = (OTDOA_RequestLocationInformation.assistanceAvailabilityType) value;
  }
  public OTDOA_RequestLocationInformation.assistanceAvailabilityType setAssistanceAvailabilityToNewInstance() {
    assistanceAvailability_ = new OTDOA_RequestLocationInformation.assistanceAvailabilityType();
    return assistanceAvailability_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getAssistanceAvailability() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getAssistanceAvailability();
          }

          @Override public void setToNewInstance() {
            setAssistanceAvailabilityToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? OTDOA_RequestLocationInformation.assistanceAvailabilityType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "assistanceAvailability : "
                    + getAssistanceAvailability().toIndentedString(indent);
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
public static class assistanceAvailabilityType extends Asn1Boolean {
  //

  private static final Asn1Tag TAG_assistanceAvailabilityType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public assistanceAvailabilityType() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_assistanceAvailabilityType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_assistanceAvailabilityType != null) {
      return ImmutableList.of(TAG_assistanceAvailabilityType);
    } else {
      return Asn1Boolean.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new assistanceAvailabilityType from encoded stream.
   */
  public static assistanceAvailabilityType fromPerUnaligned(byte[] encodedBytes) {
    assistanceAvailabilityType result = new assistanceAvailabilityType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new assistanceAvailabilityType from encoded stream.
   */
  public static assistanceAvailabilityType fromPerAligned(byte[] encodedBytes) {
    assistanceAvailabilityType result = new assistanceAvailabilityType();
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
    return "assistanceAvailabilityType = " + getValue() + ";\n";
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
    builder.append("OTDOA_RequestLocationInformation = {\n");
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
