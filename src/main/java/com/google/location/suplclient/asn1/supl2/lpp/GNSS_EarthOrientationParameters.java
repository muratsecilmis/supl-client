// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.location.suplclient.asn1.supl2.lpp;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.suplclient.asn1.base.Asn1Integer;
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Sequence;
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.base.BitStream;
import com.google.location.suplclient.asn1.base.BitStreamReader;
import com.google.location.suplclient.asn1.base.SequenceComponent;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class GNSS_EarthOrientationParameters extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_GNSS_EarthOrientationParameters
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GNSS_EarthOrientationParameters() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GNSS_EarthOrientationParameters;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GNSS_EarthOrientationParameters != null) {
      return ImmutableList.of(TAG_GNSS_EarthOrientationParameters);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GNSS_EarthOrientationParameters from encoded stream.
   */
  public static GNSS_EarthOrientationParameters fromPerUnaligned(byte[] encodedBytes) {
    GNSS_EarthOrientationParameters result = new GNSS_EarthOrientationParameters();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GNSS_EarthOrientationParameters from encoded stream.
   */
  public static GNSS_EarthOrientationParameters fromPerAligned(byte[] encodedBytes) {
    GNSS_EarthOrientationParameters result = new GNSS_EarthOrientationParameters();
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

  
  private GNSS_EarthOrientationParameters.teopType teop_;
  public GNSS_EarthOrientationParameters.teopType getTeop() {
    return teop_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_EarthOrientationParameters.teopType
   */
  public void setTeop(Asn1Object value) {
    this.teop_ = (GNSS_EarthOrientationParameters.teopType) value;
  }
  public GNSS_EarthOrientationParameters.teopType setTeopToNewInstance() {
    teop_ = new GNSS_EarthOrientationParameters.teopType();
    return teop_;
  }
  
  private GNSS_EarthOrientationParameters.pmXType pmX_;
  public GNSS_EarthOrientationParameters.pmXType getPmX() {
    return pmX_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_EarthOrientationParameters.pmXType
   */
  public void setPmX(Asn1Object value) {
    this.pmX_ = (GNSS_EarthOrientationParameters.pmXType) value;
  }
  public GNSS_EarthOrientationParameters.pmXType setPmXToNewInstance() {
    pmX_ = new GNSS_EarthOrientationParameters.pmXType();
    return pmX_;
  }
  
  private GNSS_EarthOrientationParameters.pmXdotType pmXdot_;
  public GNSS_EarthOrientationParameters.pmXdotType getPmXdot() {
    return pmXdot_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_EarthOrientationParameters.pmXdotType
   */
  public void setPmXdot(Asn1Object value) {
    this.pmXdot_ = (GNSS_EarthOrientationParameters.pmXdotType) value;
  }
  public GNSS_EarthOrientationParameters.pmXdotType setPmXdotToNewInstance() {
    pmXdot_ = new GNSS_EarthOrientationParameters.pmXdotType();
    return pmXdot_;
  }
  
  private GNSS_EarthOrientationParameters.pmYType pmY_;
  public GNSS_EarthOrientationParameters.pmYType getPmY() {
    return pmY_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_EarthOrientationParameters.pmYType
   */
  public void setPmY(Asn1Object value) {
    this.pmY_ = (GNSS_EarthOrientationParameters.pmYType) value;
  }
  public GNSS_EarthOrientationParameters.pmYType setPmYToNewInstance() {
    pmY_ = new GNSS_EarthOrientationParameters.pmYType();
    return pmY_;
  }
  
  private GNSS_EarthOrientationParameters.pmYdotType pmYdot_;
  public GNSS_EarthOrientationParameters.pmYdotType getPmYdot() {
    return pmYdot_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_EarthOrientationParameters.pmYdotType
   */
  public void setPmYdot(Asn1Object value) {
    this.pmYdot_ = (GNSS_EarthOrientationParameters.pmYdotType) value;
  }
  public GNSS_EarthOrientationParameters.pmYdotType setPmYdotToNewInstance() {
    pmYdot_ = new GNSS_EarthOrientationParameters.pmYdotType();
    return pmYdot_;
  }
  
  private GNSS_EarthOrientationParameters.deltaUT1Type deltaUT1_;
  public GNSS_EarthOrientationParameters.deltaUT1Type getDeltaUT1() {
    return deltaUT1_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_EarthOrientationParameters.deltaUT1Type
   */
  public void setDeltaUT1(Asn1Object value) {
    this.deltaUT1_ = (GNSS_EarthOrientationParameters.deltaUT1Type) value;
  }
  public GNSS_EarthOrientationParameters.deltaUT1Type setDeltaUT1ToNewInstance() {
    deltaUT1_ = new GNSS_EarthOrientationParameters.deltaUT1Type();
    return deltaUT1_;
  }
  
  private GNSS_EarthOrientationParameters.deltaUT1dotType deltaUT1dot_;
  public GNSS_EarthOrientationParameters.deltaUT1dotType getDeltaUT1dot() {
    return deltaUT1dot_;
  }
  /**
   * @throws ClassCastException if value is not a GNSS_EarthOrientationParameters.deltaUT1dotType
   */
  public void setDeltaUT1dot(Asn1Object value) {
    this.deltaUT1dot_ = (GNSS_EarthOrientationParameters.deltaUT1dotType) value;
  }
  public GNSS_EarthOrientationParameters.deltaUT1dotType setDeltaUT1dotToNewInstance() {
    deltaUT1dot_ = new GNSS_EarthOrientationParameters.deltaUT1dotType();
    return deltaUT1dot_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getTeop() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getTeop();
          }

          @Override public void setToNewInstance() {
            setTeopToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_EarthOrientationParameters.teopType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "teop : "
                    + getTeop().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getPmX() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPmX();
          }

          @Override public void setToNewInstance() {
            setPmXToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_EarthOrientationParameters.pmXType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "pmX : "
                    + getPmX().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getPmXdot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPmXdot();
          }

          @Override public void setToNewInstance() {
            setPmXdotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_EarthOrientationParameters.pmXdotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "pmXdot : "
                    + getPmXdot().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getPmY() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPmY();
          }

          @Override public void setToNewInstance() {
            setPmYToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_EarthOrientationParameters.pmYType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "pmY : "
                    + getPmY().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getPmYdot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPmYdot();
          }

          @Override public void setToNewInstance() {
            setPmYdotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_EarthOrientationParameters.pmYdotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "pmYdot : "
                    + getPmYdot().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 5);

          @Override public boolean isExplicitlySet() {
            return getDeltaUT1() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDeltaUT1();
          }

          @Override public void setToNewInstance() {
            setDeltaUT1ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_EarthOrientationParameters.deltaUT1Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "deltaUT1 : "
                    + getDeltaUT1().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 6);

          @Override public boolean isExplicitlySet() {
            return getDeltaUT1dot() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getDeltaUT1dot();
          }

          @Override public void setToNewInstance() {
            setDeltaUT1dotToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? GNSS_EarthOrientationParameters.deltaUT1dotType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "deltaUT1dot : "
                    + getDeltaUT1dot().toIndentedString(indent);
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
public static class teopType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_teopType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public teopType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("65535"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_teopType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_teopType != null) {
      return ImmutableList.of(TAG_teopType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new teopType from encoded stream.
   */
  public static teopType fromPerUnaligned(byte[] encodedBytes) {
    teopType result = new teopType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new teopType from encoded stream.
   */
  public static teopType fromPerAligned(byte[] encodedBytes) {
    teopType result = new teopType();
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
    return "teopType = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class pmXType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_pmXType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public pmXType() {
    super();
    setValueRange(new java.math.BigInteger("-1048576"), new java.math.BigInteger("1048575"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_pmXType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_pmXType != null) {
      return ImmutableList.of(TAG_pmXType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new pmXType from encoded stream.
   */
  public static pmXType fromPerUnaligned(byte[] encodedBytes) {
    pmXType result = new pmXType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new pmXType from encoded stream.
   */
  public static pmXType fromPerAligned(byte[] encodedBytes) {
    pmXType result = new pmXType();
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
    return "pmXType = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class pmXdotType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_pmXdotType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public pmXdotType() {
    super();
    setValueRange(new java.math.BigInteger("-16384"), new java.math.BigInteger("16383"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_pmXdotType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_pmXdotType != null) {
      return ImmutableList.of(TAG_pmXdotType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new pmXdotType from encoded stream.
   */
  public static pmXdotType fromPerUnaligned(byte[] encodedBytes) {
    pmXdotType result = new pmXdotType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new pmXdotType from encoded stream.
   */
  public static pmXdotType fromPerAligned(byte[] encodedBytes) {
    pmXdotType result = new pmXdotType();
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
    return "pmXdotType = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class pmYType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_pmYType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public pmYType() {
    super();
    setValueRange(new java.math.BigInteger("-1048576"), new java.math.BigInteger("1048575"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_pmYType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_pmYType != null) {
      return ImmutableList.of(TAG_pmYType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new pmYType from encoded stream.
   */
  public static pmYType fromPerUnaligned(byte[] encodedBytes) {
    pmYType result = new pmYType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new pmYType from encoded stream.
   */
  public static pmYType fromPerAligned(byte[] encodedBytes) {
    pmYType result = new pmYType();
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
    return "pmYType = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class pmYdotType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_pmYdotType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public pmYdotType() {
    super();
    setValueRange(new java.math.BigInteger("-16384"), new java.math.BigInteger("16383"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_pmYdotType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_pmYdotType != null) {
      return ImmutableList.of(TAG_pmYdotType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new pmYdotType from encoded stream.
   */
  public static pmYdotType fromPerUnaligned(byte[] encodedBytes) {
    pmYdotType result = new pmYdotType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new pmYdotType from encoded stream.
   */
  public static pmYdotType fromPerAligned(byte[] encodedBytes) {
    pmYdotType result = new pmYdotType();
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
    return "pmYdotType = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class deltaUT1Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_deltaUT1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public deltaUT1Type() {
    super();
    setValueRange(new java.math.BigInteger("-1073741824"), new java.math.BigInteger("1073741823"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_deltaUT1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_deltaUT1Type != null) {
      return ImmutableList.of(TAG_deltaUT1Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new deltaUT1Type from encoded stream.
   */
  public static deltaUT1Type fromPerUnaligned(byte[] encodedBytes) {
    deltaUT1Type result = new deltaUT1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new deltaUT1Type from encoded stream.
   */
  public static deltaUT1Type fromPerAligned(byte[] encodedBytes) {
    deltaUT1Type result = new deltaUT1Type();
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
    return "deltaUT1Type = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class deltaUT1dotType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_deltaUT1dotType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public deltaUT1dotType() {
    super();
    setValueRange(new java.math.BigInteger("-262144"), new java.math.BigInteger("262143"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_deltaUT1dotType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_deltaUT1dotType != null) {
      return ImmutableList.of(TAG_deltaUT1dotType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new deltaUT1dotType from encoded stream.
   */
  public static deltaUT1dotType fromPerUnaligned(byte[] encodedBytes) {
    deltaUT1dotType result = new deltaUT1dotType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new deltaUT1dotType from encoded stream.
   */
  public static deltaUT1dotType fromPerAligned(byte[] encodedBytes) {
    deltaUT1dotType result = new deltaUT1dotType();
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
    return "deltaUT1dotType = " + getInteger() + ";\n";
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
    builder.append("GNSS_EarthOrientationParameters = {\n");
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
