package com.fulltrix.gcyl.recipes.categories.machines;

import gregtech.api.GTValues;
import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.stack.UnificationEntry;
import gregtech.common.blocks.BlockMachineCasing;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.metatileentities.MetaTileEntities;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import static com.fulltrix.gcyl.GCYLMaterials.*;
import static gregtech.api.GTValues.L;
import static gregtech.api.recipes.GTRecipeHandler.removeRecipesByInputs;
import static gregtech.api.recipes.ModHandler.removeTieredRecipeByName;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLER_RECIPES;
import static gregtech.api.recipes.ingredients.IntCircuitIngredient.getIntegratedCircuit;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;

public class MachineCraftingRecipes {

    public static void init() {
        hullOverride();
        MultiblockCraftingRecipes.init();
        SingleblockCraftingRecipes.init();
    }

    private static void hullOverride() { //TODO add OpV machine hull recipes

        removeTieredRecipeByName("gregtech:gregtech.machine.hull.", GTValues.UHV, GTValues.MAX);
        removeRecipesByInputs(ASSEMBLER_RECIPES, new ItemStack[]{MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UHV), OreDictUnifier.get(cableGtSingle, Europium, 2)}, new FluidStack[]{Polybenzimidazole.getFluid(L * 2)});
        removeRecipesByInputs(ASSEMBLER_RECIPES, OreDictUnifier.get(plate, Neutronium, 8), getIntegratedCircuit(8));
        // UHV+ Hulls

        ModHandler.addShapedRecipe("gcyl_hull_uhv", MetaTileEntities.HULL[9].getStackForm(), "PHP", "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UHV), 'C', new UnificationEntry(cableGtSingle, TungstenTitaniumCarbide), 'H', new UnificationEntry(plate, Seaborgium), 'P', new UnificationEntry(plate, Polyetheretherketone));
        ModHandler.addShapedRecipe("gcyl_hull_uev", MetaTileEntities.HULL[10].getStackForm(), "PHP", "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UEV), 'C', new UnificationEntry(cableGtQuadruple, Pikyonium), 'H', new UnificationEntry(plate, Bohrium), 'P', new UnificationEntry(plate, Polyetheretherketone));
        ModHandler.addShapedRecipe("gcyl_hull_uiv", MetaTileEntities.HULL[11].getStackForm(), "PHP", "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UIV), 'C', new UnificationEntry(cableGtQuadruple, Cinobite), 'H', new UnificationEntry(plate, Quantum), 'P', new UnificationEntry(plate, Zylon));
        ModHandler.addShapedRecipe("gcyl_hull_uxv", MetaTileEntities.HULL[12].getStackForm(), "PHP", "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UXV), 'C', new UnificationEntry(cableGtQuadruple, NaquadriaticTaranium), 'H', new UnificationEntry(plate, BlackTitanium), 'P', new UnificationEntry(plate, FullerenePolymerMatrix));

        ASSEMBLER_RECIPES.recipeBuilder().EUt(16).duration(50).inputs(MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UHV)).input(cableGtSingle, TungstenTitaniumCarbide, 2).fluidInputs(Polyetheretherketone.getFluid(L * 2)).outputs(MetaTileEntities.HULL[9].getStackForm()).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().EUt(16).duration(50).inputs(MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UEV)).input(cableGtQuadruple, Pikyonium, 2).fluidInputs(Polyetheretherketone.getFluid(L * 2)).outputs(MetaTileEntities.HULL[10].getStackForm()).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().EUt(16).duration(50).inputs(MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UIV)).input(cableGtQuadruple, Cinobite, 2).fluidInputs(Zylon.getFluid(L * 2)).outputs(MetaTileEntities.HULL[11].getStackForm()).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().EUt(16).duration(50).inputs(MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UXV)).input(cableGtQuadruple, NaquadriaticTaranium, 2).fluidInputs(FullerenePolymerMatrix.getFluid(L * 2)).outputs(MetaTileEntities.HULL[12].getStackForm()).buildAndRegister();

        removeTieredRecipeByName("gregtech:casing_", GTValues.UHV, GTValues.MAX);
        // UHV+ Casings
        ModHandler.addShapedRecipe("gcyl_casing_uhv", MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UHV), "PPP", "PwP", "PPP", 'P', new UnificationEntry(plate, Seaborgium));
        ModHandler.addShapedRecipe("gcyl_casing_uev", MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UEV), "PPP", "PwP", "PPP", 'P', new UnificationEntry(plate, Bohrium));
        ModHandler.addShapedRecipe("gcyl_casing_uiv", MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UIV), "PPP", "PwP", "PPP", 'P', new UnificationEntry(plate, Quantum));
        ModHandler.addShapedRecipe("gcyl_casing_uxv", MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UXV), "PPP", "PwP", "PPP", 'P', new UnificationEntry(plate, BlackTitanium));
        ASSEMBLER_RECIPES.recipeBuilder().EUt(16).duration(50).circuitMeta(8).input(plate, Seaborgium, 8).outputs(MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UHV)).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().EUt(16).duration(50).circuitMeta(8).input(plate, Bohrium, 8).outputs(MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UEV)).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().EUt(16).duration(50).circuitMeta(8).input(plate, Quantum, 8).outputs(MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UIV)).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().EUt(16).duration(50).circuitMeta(8).input(plate, BlackTitanium, 8).outputs(MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UXV)).buildAndRegister();

    }

    /*
    public static void init() {
        MultiblockCraftingRecipes.init();

        hullOverride();
        misc();
    }

    private static void hullOverride() {


        // Hull Overrides
        removeTieredRecipeByName("gregtech:hull_", ULV, GTValues.MAX);


            removeRecipesByInputs(ASSEMBLER_RECIPES, new ItemStack[]{MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.ULV), OreDictUnifier.get(cableGtSingle, Lead, 2)}, new FluidStack[]{Polyethylene.getFluid(L * 2)});
            removeRecipesByInputs(ASSEMBLER_RECIPES, new ItemStack[]{MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.LV), OreDictUnifier.get(cableGtSingle, Tin, 2)}, new FluidStack[]{Polyethylene.getFluid(L * 2)});
            removeRecipesByInputs(ASSEMBLER_RECIPES, new ItemStack[]{MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.MV), OreDictUnifier.get(cableGtSingle, Copper, 2)}, new FluidStack[]{Polyethylene.getFluid(L * 2)});
            removeRecipesByInputs(ASSEMBLER_RECIPES, new ItemStack[]{MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.MV), OreDictUnifier.get(cableGtSingle, AnnealedCopper, 2)}, new FluidStack[]{Polyethylene.getFluid(L * 2)});
            removeRecipesByInputs(ASSEMBLER_RECIPES, new ItemStack[]{MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.HV), OreDictUnifier.get(cableGtSingle, Gold, 2)}, new FluidStack[]{Polyethylene.getFluid(L * 2)});
            removeRecipesByInputs(ASSEMBLER_RECIPES, new ItemStack[]{MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.EV), OreDictUnifier.get(cableGtSingle, Aluminium, 2)}, new FluidStack[]{Polyethylene.getFluid(L * 2)});
            removeRecipesByInputs(ASSEMBLER_RECIPES, new ItemStack[]{MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.IV), OreDictUnifier.get(cableGtSingle, Tungsten, 2)}, new FluidStack[]{Polyethylene.getFluid(L * 2)});
            removeRecipesByInputs(ASSEMBLER_RECIPES, new ItemStack[]{MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.LuV), OreDictUnifier.get(cableGtSingle, VanadiumGallium, 2)}, new FluidStack[]{Polyethylene.getFluid(L * 2)});
            removeRecipesByInputs(ASSEMBLER_RECIPES, new ItemStack[]{MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.ZPM), OreDictUnifier.get(cableGtSingle, Naquadah, 2)}, new FluidStack[]{Polytetrafluoroethylene.getFluid(L * 2)});
            removeRecipesByInputs(ASSEMBLER_RECIPES, new ItemStack[]{MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UV), OreDictUnifier.get(cableGtQuadruple, NaquadahAlloy, 2)}, new FluidStack[]{Polytetrafluoroethylene.getFluid(L * 2)});
            removeRecipesByInputs(ASSEMBLER_RECIPES, new ItemStack[]{MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.MAX), OreDictUnifier.get(cableGtSingle, Superconductor, 2)}, new FluidStack[]{Polytetrafluoroethylene.getFluid(L * 2)});


        ModHandler.addShapedRecipe("ga_hull_ulv", MetaTileEntities.HULL[ULV].getStackForm(), "PHP", "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.ULV), 'C', new UnificationEntry(cableGtSingle, Lead), 'H', new UnificationEntry(plate, WroughtIron), 'P', new UnificationEntry(plate, Wood));
        ModHandler.addShapedRecipe("ga_hull_lv", MetaTileEntities.HULL[LV].getStackForm(), "PHP", "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.LV), 'C', new UnificationEntry(cableGtSingle, Tin), 'H', new UnificationEntry(plate, Steel), 'P', new UnificationEntry(plate, WroughtIron));
        ModHandler.addShapedRecipe("ga_hull_mv", MetaTileEntities.HULL[MV].getStackForm(), "PHP", "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.MV), 'C', new UnificationEntry(cableGtSingle, Copper), 'H', new UnificationEntry(plate, Aluminium), 'P', new UnificationEntry(plate, WroughtIron));
        ModHandler.addShapedRecipe("ga_hull_hv", MetaTileEntities.HULL[HV].getStackForm(), "PHP", "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.HV), 'C', new UnificationEntry(cableGtSingle, Gold), 'H', new UnificationEntry(plate, StainlessSteel), 'P', new UnificationEntry(plate, Plastic));
        ModHandler.addShapedRecipe("ga_hull_ev", MetaTileEntities.HULL[EV].getStackForm(), "PHP", "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.EV), 'C', new UnificationEntry(cableGtSingle, Aluminium), 'H', new UnificationEntry(plate, Titanium), 'P', new UnificationEntry(plate, Plastic));
        ModHandler.addShapedRecipe("ga_hull_iv", MetaTileEntities.HULL[IV].getStackForm(), "PHP", "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.IV), 'C', new UnificationEntry(cableGtSingle, Tungsten), 'H', new UnificationEntry(plate, TungstenSteel), 'P', new UnificationEntry(plate, Polytetrafluoroethylene));
        ModHandler.addShapedRecipe("ga_hull_luv", MetaTileEntities.HULL[LuV].getStackForm(), "PHP", "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.LuV), 'C', new UnificationEntry(cableGtSingle, VanadiumGallium), 'H', new UnificationEntry(plate, RhodiumPlatedPalladium), 'P', new UnificationEntry(plate, Polytetrafluoroethylene));
        ModHandler.addShapedRecipe("ga_hull_zpm", MetaTileEntities.HULL[GTValues.ZPM].getStackForm(), "PHP", "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.ZPM), 'C', new UnificationEntry(cableGtSingle, Naquadah), 'H', new UnificationEntry(plate, Osmiridium), 'P', new UnificationEntry(plate, Polybenzimidazole));
        ModHandler.addShapedRecipe("ga_hull_uv", MetaTileEntities.HULL[UV].getStackForm(), "PHP", "CMC", 'M', MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UV), 'C', new UnificationEntry(cableGtSingle, NaquadahAlloy), 'H', new UnificationEntry(plate, Tritanium), 'P', new UnificationEntry(plate, Polybenzimidazole));

        ASSEMBLER_RECIPES.recipeBuilder().duration(25).EUt(16).inputs(MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.ULV)).input(cableGtSingle, Lead, 2).fluidInputs(Plastic.getFluid(L * 2)).outputs(MetaTileEntities.HULL[0].getStackForm()).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().duration(50).EUt(16).inputs(MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.LV)).input(cableGtSingle, Tin, 2).fluidInputs(Plastic.getFluid(L * 2)).outputs(MetaTileEntities.HULL[1].getStackForm()).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().duration(50).EUt(16).inputs(MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.MV)).input(cableGtSingle, Copper, 2).fluidInputs(Plastic.getFluid(L * 2)).outputs(MetaTileEntities.HULL[2].getStackForm()).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().duration(50).EUt(16).inputs(MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.MV)).input(cableGtSingle, AnnealedCopper, 2).fluidInputs(Plastic.getFluid(L * 2)).outputs(MetaTileEntities.HULL[2].getStackForm()).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().duration(50).EUt(16).inputs(MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.HV)).input(cableGtSingle, Gold, 2).fluidInputs(Plastic.getFluid(L * 2)).outputs(MetaTileEntities.HULL[3].getStackForm()).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().duration(50).EUt(16).inputs(MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.EV)).input(cableGtSingle, Aluminium, 2).fluidInputs(Plastic.getFluid(L * 2)).outputs(MetaTileEntities.HULL[4].getStackForm()).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().duration(50).EUt(16).inputs(MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.IV)).input(cableGtSingle, Tungsten, 2).fluidInputs(Polytetrafluoroethylene.getFluid(L * 2)).outputs(MetaTileEntities.HULL[5].getStackForm()).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().duration(50).EUt(16).inputs(MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.LuV)).input(cableGtSingle, VanadiumGallium, 2).fluidInputs(Polytetrafluoroethylene.getFluid(L * 2)).outputs(MetaTileEntities.HULL[6].getStackForm()).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().duration(50).EUt(16).inputs(MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.ZPM)).input(cableGtSingle, Naquadah, 2).fluidInputs(Polybenzimidazole.getFluid(L * 2)).outputs(MetaTileEntities.HULL[7].getStackForm()).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().duration(50).EUt(16).inputs(MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UV)).input(cableGtSingle, NaquadahAlloy, 2).fluidInputs(Polybenzimidazole.getFluid(L * 2)).outputs(MetaTileEntities.HULL[8].getStackForm()).buildAndRegister();




        // Casing Overrides
        // Metals changed from base GTCE
        removeTieredRecipeByName("gregtech:casing_", LuV, GTValues.MAX);
        removeRecipesByInputs(ASSEMBLER_RECIPES, OreDictUnifier.get(plate, Chrome, 8), getIntegratedCircuit(8));
        removeRecipesByInputs(ASSEMBLER_RECIPES, OreDictUnifier.get(plate, Iridium, 8), getIntegratedCircuit(8));
        removeRecipesByInputs(ASSEMBLER_RECIPES, OreDictUnifier.get(plate, Osmium, 8), getIntegratedCircuit(8));
        removeRecipesByInputs(ASSEMBLER_RECIPES, OreDictUnifier.get(plate, Darmstadtium, 8), getIntegratedCircuit(8)); // MAX doesn't have a recipe yet

        ModHandler.addShapedRecipe("ga_casing_luv", MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.LuV), "PPP", "PwP", "PPP", 'P', new UnificationEntry(plate, RhodiumPlatedPalladium));
        ModHandler.addShapedRecipe("ga_casing_zpm", MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.ZPM), "PPP", "PwP", "PPP", 'P', new UnificationEntry(plate, Osmiridium));
        ModHandler.addShapedRecipe("ga_casing_uv", MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UV), "PPP", "PwP", "PPP", 'P', new UnificationEntry(plate, Tritanium));
        ASSEMBLER_RECIPES.recipeBuilder().EUt(16).duration(50).circuitMeta(8).input(plate, RhodiumPlatedPalladium, 8).outputs(MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.LuV)).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().EUt(16).duration(50).circuitMeta(8).input(plate, Osmiridium, 8).outputs(MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.ZPM)).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().EUt(16).duration(50).circuitMeta(8).input(plate, Tritanium, 8).outputs(MetaBlocks.MACHINE_CASING.getItemVariant(BlockMachineCasing.MachineCasingType.UV)).buildAndRegister();



    }

    private static void misc() {

        // Fluid Export Hatch
        ModHandler.addShapedRecipe("ga_filtered_fluid_export_hatch_ulv", GATileEntities.OUTPUT_HATCH_FILTERED.get(GAValues.ULV).getStackForm(), "F", "M", "G", 'M', MetaTileEntities.HULL[ULV].getStackForm(), 'G', Blocks.GLASS, 'F', MetaItems.FLUID_FILTER);
        ModHandler.addShapedRecipe("ga_filtered_fluid_export_hatch_lv", GATileEntities.OUTPUT_HATCH_FILTERED.get(GAValues.LV).getStackForm(), "F", "M", "G", 'M', MetaTileEntities.HULL[LV].getStackForm(), 'G', Blocks.GLASS, 'F', MetaItems.FLUID_FILTER);
        ModHandler.addShapedRecipe("ga_filtered_fluid_export_hatch_mv", GATileEntities.OUTPUT_HATCH_FILTERED.get(GAValues.MV).getStackForm(), "F", "M", "G", 'M', MetaTileEntities.HULL[GAValues.MV].getStackForm(), 'G', Blocks.GLASS, 'F', MetaItems.FLUID_FILTER);
        ModHandler.addShapedRecipe("ga_filtered_fluid_export_hatch_hv", GATileEntities.OUTPUT_HATCH_FILTERED.get(GAValues.HV).getStackForm(), "F", "M", "G", 'M', MetaTileEntities.HULL[GAValues.HV].getStackForm(), 'G', Blocks.GLASS, 'F', MetaItems.FLUID_FILTER);
        ModHandler.addShapedRecipe("ga_filtered_fluid_export_hatch_ev", GATileEntities.OUTPUT_HATCH_FILTERED.get(GAValues.EV).getStackForm(), "F", "M", "G", 'M', MetaTileEntities.HULL[GAValues.EV].getStackForm(), 'G', Blocks.GLASS, 'F', MetaItems.FLUID_FILTER);
        ModHandler.addShapedRecipe("ga_filtered_fluid_export_hatch_iv", GATileEntities.OUTPUT_HATCH_FILTERED.get(GAValues.IV).getStackForm(), "F", "M", "G", 'M', MetaTileEntities.HULL[GAValues.IV].getStackForm(), 'G', Blocks.GLASS, 'F', MetaItems.FLUID_FILTER);
        ModHandler.addShapedRecipe("ga_filtered_fluid_export_hatch_luv", GATileEntities.OUTPUT_HATCH_FILTERED.get(GAValues.LuV).getStackForm(), "F", "M", "G", 'M', MetaTileEntities.HULL[GAValues.LuV].getStackForm(), 'G', Blocks.GLASS, 'F', MetaItems.FLUID_FILTER);
        ModHandler.addShapedRecipe("ga_filtered_fluid_export_hatch_zpm", GATileEntities.OUTPUT_HATCH_FILTERED.get(GAValues.ZPM).getStackForm(), "F", "M", "G", 'M', MetaTileEntities.HULL[GAValues.ZPM].getStackForm(), 'G', Blocks.GLASS, 'F', MetaItems.FLUID_FILTER);
        ModHandler.addShapedRecipe("ga_filtered_fluid_export_hatch_uv", GATileEntities.OUTPUT_HATCH_FILTERED.get(GAValues.UV).getStackForm(), "F", "M", "G", 'M', MetaTileEntities.HULL[GAValues.UV].getStackForm(), 'G', Blocks.GLASS, 'F', MetaItems.FLUID_FILTER);
        ModHandler.addShapedRecipe("ga_filtered_fluid_export_hatch_max", GATileEntities.OUTPUT_HATCH_FILTERED.get(9).getStackForm(), "F", "M", "G", 'M', MetaTileEntities.HULL[GTValues.MAX].getStackForm(), 'G', Blocks.GLASS, 'F', MetaItems.FLUID_FILTER);

        OrePrefix plateOrCurved = GAConfig.GT6.addCurvedPlates ? plateCurved : plate;
        // Drums
        ModHandler.addShapedRecipe("wooden_barrel", GATileEntities.WOODEN_DRUM.getStackForm(), "rSs", "PRP", "PRP", 'S', Items.SLIME_BALL, 'P', "plankWood", 'R', new UnificationEntry(stickLong, Iron));
        ASSEMBLER_RECIPES.recipeBuilder().EUt(30).duration(200).inputs(new ItemStack(Blocks.PLANKS, 4, GTValues.W)).inputs(new ItemStack(Items.SLIME_BALL)).input(stickLong, Iron, 2).outputs(GATileEntities.WOODEN_DRUM.getStackForm()).circuitMeta(1).buildAndRegister();

        ModHandler.addShapedRecipe("bronze_drum", GATileEntities.BRONZE_DRUM.getStackForm(), " h ", "PRP", "PRP", 'P', new UnificationEntry(plateOrCurved, Bronze), 'R', new UnificationEntry(stickLong, Bronze));
        ModHandler.addShapedRecipe("steel_drum", GATileEntities.STEEL_DRUM.getStackForm(), " h ", "PRP", "PRP", 'P', new UnificationEntry(plateOrCurved, Steel), 'R', new UnificationEntry(stickLong, Steel));
        ModHandler.addShapedRecipe("stainless_steel_drum", GATileEntities.STAINLESS_STEEL_DRUM.getStackForm(), " h ", "PRP", "PRP", 'P', new UnificationEntry(plateOrCurved, StainlessSteel), 'R', new UnificationEntry(stickLong, StainlessSteel));
        ModHandler.addShapedRecipe("titanium_drum", GATileEntities.TITANIUM_DRUM.getStackForm(), " h ", "PRP", "PRP", 'P', new UnificationEntry(plateOrCurved, Titanium), 'R', new UnificationEntry(stickLong, Titanium));
        ModHandler.addShapedRecipe("tungstensteel_drum", GATileEntities.TUNGSTENSTEEL_DRUM.getStackForm(), " h ", "PRP", "PRP", 'P', new UnificationEntry(plateOrCurved, TungstenSteel), 'R', new UnificationEntry(stickLong, TungstenSteel));
        ASSEMBLER_RECIPES.recipeBuilder().EUt(30).duration(200).input(plateOrCurved, Bronze, 4).input(stickLong, Bronze, 2).outputs(GATileEntities.BRONZE_DRUM.getStackForm()).circuitMeta(1).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().EUt(30).duration(200).input(plateOrCurved, Steel, 4).input(stickLong, Steel, 2).outputs(GATileEntities.STEEL_DRUM.getStackForm()).circuitMeta(1).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().EUt(30).duration(200).input(plateOrCurved, StainlessSteel, 4).input(stickLong, StainlessSteel, 2).outputs(GATileEntities.STAINLESS_STEEL_DRUM.getStackForm()).circuitMeta(1).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().EUt(30).duration(200).input(plateOrCurved, Titanium, 4).input(stickLong, Titanium, 2).outputs(GATileEntities.TITANIUM_DRUM.getStackForm()).circuitMeta(1).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().EUt(30).duration(200).input(plateOrCurved, TungstenSteel, 4).input(stickLong, TungstenSteel, 2).outputs(GATileEntities.TUNGSTENSTEEL_DRUM.getStackForm()).circuitMeta(1).buildAndRegister();

        // Crates
        ModHandler.addShapedRecipe("wooden_crate", GATileEntities.WOODEN_CRATE.getStackForm(), "RPR", "PsP", "RPR", 'P', "plankWood", 'R', new UnificationEntry(screw, Iron));
        ASSEMBLER_RECIPES.recipeBuilder().EUt(30).duration(200).inputs(new ItemStack(Blocks.PLANKS, 4, GTValues.W)).input(screw, Iron, 4).outputs(GATileEntities.WOODEN_CRATE.getStackForm()).circuitMeta(2).buildAndRegister();

        ModHandler.addShapedRecipe("bronze_crate", GATileEntities.BRONZE_CRATE.getStackForm(), "RPR", "PhP", "RPR", 'P', new UnificationEntry(plateOrCurved, Bronze), 'R', new UnificationEntry(stickLong, Bronze));
        ModHandler.addShapedRecipe("steel_crate", GATileEntities.STEEL_CRATE.getStackForm(), "RPR", "PhP", "RPR", 'P', new UnificationEntry(plateOrCurved, Steel), 'R', new UnificationEntry(stickLong, Steel));
        ModHandler.addShapedRecipe("stainless_steel_crate", GATileEntities.STAINLESS_STEEL_CRATE.getStackForm(), "RPR", "PhP", "RPR", 'P', new UnificationEntry(plateOrCurved, StainlessSteel), 'R', new UnificationEntry(stickLong, StainlessSteel));
        ModHandler.addShapedRecipe("titanium_crate", GATileEntities.TITANIUM_CRATE.getStackForm(), "RPR", "PhP", "RPR", 'P', new UnificationEntry(plateOrCurved, Titanium), 'R', new UnificationEntry(stickLong, Titanium));
        ModHandler.addShapedRecipe("tungstensteel_crate", GATileEntities.TUNGSTENSTEEL_CRATE.getStackForm(), "RPR", "PhP", "RPR", 'P', new UnificationEntry(plateOrCurved, TungstenSteel), 'R', new UnificationEntry(stickLong, TungstenSteel));
        ASSEMBLER_RECIPES.recipeBuilder().EUt(30).duration(200).input(plateOrCurved, Bronze, 4).input(stickLong, Bronze, 4).outputs(GATileEntities.BRONZE_CRATE.getStackForm()).circuitMeta(2).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().EUt(30).duration(200).input(plateOrCurved, Steel, 4).input(stickLong, Steel, 4).outputs(GATileEntities.STEEL_CRATE.getStackForm()).circuitMeta(2).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().EUt(30).duration(200).input(plateOrCurved, StainlessSteel, 4).input(stickLong, StainlessSteel, 4).outputs(GATileEntities.STAINLESS_STEEL_CRATE.getStackForm()).circuitMeta(2).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().EUt(30).duration(200).input(plateOrCurved, Titanium, 4).input(stickLong, Titanium, 4).outputs(GATileEntities.TITANIUM_CRATE.getStackForm()).circuitMeta(2).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().EUt(30).duration(200).input(plateOrCurved, TungstenSteel, 4).input(stickLong, TungstenSteel, 4).outputs(GATileEntities.TUNGSTENSTEEL_CRATE.getStackForm()).circuitMeta(2).buildAndRegister();

        // Energy Converters
        for (final EnergyConverterType type : EnergyConverterType.values()) {
            if (GATileEntities.ENERGY_CONVERTER.containsKey(type)) {
                GATileEntities.ENERGY_CONVERTER.get(type).forEach(EnergyConverterCraftingHelper.HELPER.logic(type));
            }
        }

        // Hot Coolant Rotor Holders
        ModHandler.addShapedRecipe("ga_rotor_holder_hv", GATileEntities.ROTOR_HOLDER[0].getStackForm(), "WHW", "WRW", "WWW", 'H', MetaTileEntities.HULL[HV].getStackForm(), 'W', new UnificationEntry(wireGtHex, Gold), 'R', new UnificationEntry(gear, BlackSteel));
        ModHandler.addShapedRecipe("ga_rotor_holder_luv", GATileEntities.ROTOR_HOLDER[1].getStackForm(), "WHW", "WRW", "WWW", 'H', MetaTileEntities.HULL[LuV].getStackForm(), 'W', new UnificationEntry(wireGtHex, YttriumBariumCuprate), 'R', new UnificationEntry(gear, RhodiumPlatedPalladium));
        ModHandler.addShapedRecipe("ga_rotor_holder_uhv", GATileEntities.ROTOR_HOLDER[2].getStackForm(), "WHW", "WRW", "WWW", 'H', GATileEntities.GA_HULLS[0].getStackForm(), 'W', new UnificationEntry(wireGtHex, Duranium), 'R', new UnificationEntry(gear, Seaborgium));

        // UHV+ Energy Input/Output Hatches
        ModHandler.addShapedRecipe("ga_energy_input_hatch_uhv", GATileEntities.ENERGY_INPUT[0].getStackForm(), "   ", "CM ", "   ", 'M', GATileEntities.GA_HULLS[0].getStackForm(), 'C', new UnificationEntry(cableGtSingle, TungstenTitaniumCarbide));
        ModHandler.addShapedRecipe("ga_energy_input_hatch_uev", GATileEntities.ENERGY_INPUT[1].getStackForm(), "   ", "CM ", "   ", 'M', GATileEntities.GA_HULLS[1].getStackForm(), 'C', new UnificationEntry(cableGtSingle, Pikyonium));
        ModHandler.addShapedRecipe("ga_energy_input_hatch_uiv", GATileEntities.ENERGY_INPUT[2].getStackForm(), "   ", "CM ", "   ", 'M', GATileEntities.GA_HULLS[2].getStackForm(), 'C', new UnificationEntry(cableGtSingle, Cinobite));
        ModHandler.addShapedRecipe("ga_energy_input_hatch_umv", GATileEntities.ENERGY_INPUT[3].getStackForm(), "   ", "CM ", "   ", 'M', GATileEntities.GA_HULLS[3].getStackForm(), 'C', new UnificationEntry(cableGtSingle, NaquadriaticTaranium));
        ModHandler.addShapedRecipe("ga_energy_output_hatch_uhv", GATileEntities.ENERGY_OUTPUT[0].getStackForm(), "   ", " MC", "   ", 'M', GATileEntities.GA_HULLS[0].getStackForm(), 'C', new UnificationEntry(cableGtSingle, TungstenTitaniumCarbide));
        ModHandler.addShapedRecipe("ga_energy_output_hatch_uev", GATileEntities.ENERGY_OUTPUT[1].getStackForm(), "   ", " MC", "   ", 'M', GATileEntities.GA_HULLS[1].getStackForm(), 'C', new UnificationEntry(cableGtSingle, Pikyonium));
        ModHandler.addShapedRecipe("ga_energy_output_hatch_uiv", GATileEntities.ENERGY_OUTPUT[2].getStackForm(), "   ", " MC", "   ", 'M', GATileEntities.GA_HULLS[2].getStackForm(), 'C', new UnificationEntry(cableGtSingle, Cinobite));
        ModHandler.addShapedRecipe("ga_energy_output_hatch_umv", GATileEntities.ENERGY_OUTPUT[3].getStackForm(), "   ", " MC", "   ", 'M', GATileEntities.GA_HULLS[3].getStackForm(), 'C', new UnificationEntry(cableGtSingle, NaquadriaticTaranium));

        // Maintenance Hatches
        ModHandler.addShapedRecipe("ga_maintenance_hatch", GATileEntities.MAINTENANCE_HATCH[0].getStackForm(), "dwx", "hHc", "fsr", 'H', MetaTileEntities.HULL[1].getStackForm());
        ASSEMBLER_RECIPES.recipeBuilder().EUt(30).duration(500).inputs(MetaTileEntities.HULL[LV].getStackForm()).circuitMeta(21).outputs(GATileEntities.MAINTENANCE_HATCH[0].getStackForm()).buildAndRegister();
        ModHandler.addShapedRecipe("ga_maintenance_hatch_auto_tape", GATileEntities.MAINTENANCE_HATCH[1].getStackForm(), "CMC", "RHR", "CMC", 'C', new UnificationEntry(circuit, Elite), 'M', GATileEntities.MAINTENANCE_HATCH[0].getStackForm(), 'R', MetaItems.ROBOT_ARM_IV, 'H', MetaTileEntities.HULL[IV].getStackForm());
        ASSEMBLER_RECIPES.recipeBuilder().EUt(1920).duration(500).inputs(MetaTileEntities.HULL[IV].getStackForm(), MetaItems.ROBOT_ARM_IV.getStackForm(2), GATileEntities.MAINTENANCE_HATCH[0].getStackForm(2)).input(circuit, Elite, 2).outputs(GATileEntities.MAINTENANCE_HATCH[1].getStackForm()).buildAndRegister();
        GARecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder().EUt(491520).duration(1000).input(wireFine, Dubnium, 64).input(circuit, Superconductor).inputs(MetaItems.ROBOT_ARM_UV.getStackForm(), MetaItems.ELECTRIC_PUMP_UV.getStackForm(), MetaItems.CONVEYOR_MODULE_UV.getStackForm(), GAMetaItems.INSULATING_TAPE.getStackForm(64), GAMetaItems.INSULATING_TAPE.getStackForm(64), GATileEntities.MAINTENANCE_HATCH[1].getStackForm()).fluidInputs(SolderingAlloy.getFluid(1296), Lubricant.getFluid(6400)).outputs(GATileEntities.MAINTENANCE_HATCH[2].getStackForm()).buildAndRegister();

        //Quadruple and Nonuple Inputs and Outputs
        ASSEMBLER_RECIPES.recipeBuilder().EUt(120).duration(100).inputs(MetaTileEntities.HULL[HV].getStackForm()).input(pipeLarge, Titanium, 4).circuitMeta(0).outputs(GATileEntities.INPUT_HATCH_MULTI.get(0).getStackForm()).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().EUt(120).duration(100).inputs(MetaTileEntities.HULL[HV].getStackForm()).input(pipeLarge, Titanium, 4).circuitMeta(1).outputs(GATileEntities.OUTPUT_HATCH_MULTI.get(0).getStackForm()).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().EUt(1920).duration(100).inputs(MetaTileEntities.HULL[IV].getStackForm()).input(pipeLarge, TungstenSteel, 9).circuitMeta(0).outputs(GATileEntities.INPUT_HATCH_MULTI.get(1).getStackForm()).buildAndRegister();
        ASSEMBLER_RECIPES.recipeBuilder().EUt(1920).duration(100).inputs(MetaTileEntities.HULL[IV].getStackForm()).input(pipeLarge, TungstenSteel, 9).circuitMeta(1).outputs(GATileEntities.OUTPUT_HATCH_MULTI.get(1).getStackForm()).buildAndRegister();

        ModHandler.addShapedRecipe("ga_volcanus", GATileEntities.VOLCANUS.getStackForm(), "GCG", "IHI", "PCP", 'H', GATileEntities.ELECTRIC_BLAST_FURNACE.getStackForm(), 'C', new UnificationEntry(circuit, Elite), 'P', new UnificationEntry(plateDense, HastelloyN), 'G', new UnificationEntry(gear, HastelloyN), 'I', MetaItems.ROBOT_ARM_IV);
        ModHandler.addShapedRecipe("ga_cryogenic_freezer", GATileEntities.CRYOGENIC_FREEZER.getStackForm(), "GCG", "IHI", "PCP", 'H', GATileEntities.VACUUM_FREEZER.getStackForm(), 'C', new UnificationEntry(circuit, Elite), 'P', new UnificationEntry(plateDense, HG1223), 'G', new UnificationEntry(gear, IncoloyMA956), 'I', MetaItems.ELECTRIC_PISTON_IV);

    }

         */
}
