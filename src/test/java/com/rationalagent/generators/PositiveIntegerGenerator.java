package com.rationalagent.generators;


import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

import java.util.concurrent.ThreadLocalRandom;

public class PositiveIntegerGenerator extends Generator<Integer> {

  public PositiveIntegerGenerator() {
    super(Integer.class);
  }

  @Override
  public Integer generate(SourceOfRandomness random, GenerationStatus status) {
    return ThreadLocalRandom.current().nextInt(1, 1_000_000);
  }
}