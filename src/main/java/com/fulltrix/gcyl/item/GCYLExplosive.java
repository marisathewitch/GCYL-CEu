package com.fulltrix.gcyl.item;

import gregtech.api.block.VariantBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.IStringSerializable;

public class GCYLExplosive extends VariantBlock<GCYLExplosive.ExplosiveType> {
    public GCYLExplosive() {
        super(Material.IRON);
        setTranslationKey("gcyl_explosive");
        setHardness(5.0f);
        setResistance(10.0f);
        setSoundType(SoundType.METAL);
        setHarvestLevel("wrench", 2);
        setDefaultState(getState(ExplosiveType.TARANIUM_CHARGE));
    }

    public enum ExplosiveType implements IStringSerializable {

        TARANIUM_CHARGE("taranium_charge"),
        NAQUADRIA_CHARGE("naquadria_charge"),
        LEPTONIC_CHARGE("leptonic_charge"),
        QCD_CHARGE("qcd_charge"),
        ITNT("industrial_tnt"),
        POWDER_BARREL("powder_barrel");


        private final String name;

        ExplosiveType(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return this.name;
        }

    }
}
