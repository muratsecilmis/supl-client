package com.google.location.lbs.asn1.supl2.supl_triggered_start;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1Null;
import com.google.location.lbs.asn1.base.Asn1SequenceOf;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
 * 
 */
public  class GeographicTargetAreaList
    extends Asn1SequenceOf<GeographicTargetArea> {
  //

  private static final Asn1Tag TAG_GeographicTargetAreaList
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GeographicTargetAreaList() {
    super();
    setMinSize(1);
setMaxSize(32);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GeographicTargetAreaList;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GeographicTargetAreaList != null) {
      return ImmutableList.of(TAG_GeographicTargetAreaList);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GeographicTargetAreaList from encoded stream.
   */
  public static GeographicTargetAreaList fromPerUnaligned(byte[] encodedBytes) {
    GeographicTargetAreaList result = new GeographicTargetAreaList();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GeographicTargetAreaList from encoded stream.
   */
  public static GeographicTargetAreaList fromPerAligned(byte[] encodedBytes) {
    GeographicTargetAreaList result = new GeographicTargetAreaList();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public GeographicTargetArea createAndAddValue() {
    GeographicTargetArea value = new GeographicTargetArea();
    add(value);
    return value;
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
    builder.append("GeographicTargetAreaList = [\n");
    final String internalIndent = indent + "  ";
    for (GeographicTargetArea value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}
