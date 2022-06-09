package com.github.longdt.model;

import com.dslplatform.json.CompiledJson;

import java.math.BigInteger;
import java.util.List;

@CompiledJson
public record GetNftsRequest(List<BigInteger> nfts) {
}
