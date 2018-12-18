package com.google.location.lbs.asn1.supl2.supl_auth_req;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1Null;
import com.google.location.lbs.asn1.base.Asn1Object;
import com.google.location.lbs.asn1.base.Asn1Sequence;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.location.lbs.asn1.base.SequenceComponent;
import com.google.location.lbs.asn1.supl2.supl_start.SETCapabilities;
import com.google.location.lbs.asn1.supl2.ulp_components.Ver;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class SUPLAUTHREQ extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_SUPLAUTHREQ
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SUPLAUTHREQ() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SUPLAUTHREQ;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SUPLAUTHREQ != null) {
      return ImmutableList.of(TAG_SUPLAUTHREQ);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SUPLAUTHREQ from encoded stream.
   */
  public static SUPLAUTHREQ fromPerUnaligned(byte[] encodedBytes) {
    SUPLAUTHREQ result = new SUPLAUTHREQ();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SUPLAUTHREQ from encoded stream.
   */
  public static SUPLAUTHREQ fromPerAligned(byte[] encodedBytes) {
    SUPLAUTHREQ result = new SUPLAUTHREQ();
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

  
  private Ver ver_;
  public Ver getVer() {
    return ver_;
  }
  /**
   * @throws ClassCastException if value is not a Ver
   */
  public void setVer(Asn1Object value) {
    this.ver_ = (Ver) value;
  }
  public Ver setVerToNewInstance() {
    ver_ = new Ver();
    return ver_;
  }
  
  private SETCapabilities sETCapabilities_;
  public SETCapabilities getSETCapabilities() {
    return sETCapabilities_;
  }
  /**
   * @throws ClassCastException if value is not a SETCapabilities
   */
  public void setSETCapabilities(Asn1Object value) {
    this.sETCapabilities_ = (SETCapabilities) value;
  }
  public SETCapabilities setSETCapabilitiesToNewInstance() {
    sETCapabilities_ = new SETCapabilities();
    return sETCapabilities_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getVer() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getVer();
          }

          @Override public void setToNewInstance() {
            setVerToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Ver.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "ver : "
                    + getVer().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getSETCapabilities() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSETCapabilities();
          }

          @Override public void setToNewInstance() {
            setSETCapabilitiesToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? SETCapabilities.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "sETCapabilities : "
                    + getSETCapabilities().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
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
    builder.append("SUPLAUTHREQ = {\n");
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
