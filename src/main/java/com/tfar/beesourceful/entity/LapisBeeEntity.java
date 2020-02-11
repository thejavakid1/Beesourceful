package com.tfar.beesourceful.entity;

import com.tfar.beesourceful.BeeSourceful;
import com.tfar.beesourceful.Tags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.entity.passive.IronBeeEntity;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.village.PointOfInterestType;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import java.util.function.Predicate;

public class LapisBeeEntity extends IronBeeEntity {
  public LapisBeeEntity(EntityType<? extends BeeEntity> p_i225714_1_, World p_i225714_2_) {
    super(p_i225714_1_, p_i225714_2_);
  }

  public Block getOre(){
    return Blocks.LAPIS_ORE;
  }

  public Block getAllowedHive() {
    return BeeSourceful.Objectholders.lapis_bee_nest;
  }

  @Nonnull
  public PointOfInterestType getHivePoi(){
    return BeeSourceful.Objectholders.POI.lapis_bee_nest;
  }

  public Item getHoneyComb(){
    return BeeSourceful.Objectholders.lapis_honeycomb;
  }
}
