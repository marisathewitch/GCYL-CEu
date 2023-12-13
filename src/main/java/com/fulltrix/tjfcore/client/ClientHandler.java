package com.fulltrix.tjfcore.client;

import com.fulltrix.tjfcore.TJFCore;
import gregtech.client.renderer.texture.cube.OrientedOverlayRenderer;
import gregtech.client.renderer.texture.cube.SimpleOverlayRenderer;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(modid = TJFCore.MODID, value = Side.CLIENT)
public class ClientHandler {

    public static OrientedOverlayRenderer QUBIT_COMPUTER_OVERLAY;
    public static OrientedOverlayRenderer ORGANIC_REPLICATOR_OVERLAY;
    public static OrientedOverlayRenderer FUSION_REACTOR_OVERLAY;
    public static SimpleOverlayRenderer FUSION_TEXTURE;
    public static SimpleOverlayRenderer BIO_REACTOR;
    public static SimpleOverlayRenderer STABALLOY_CASING;
    public static SimpleOverlayRenderer QUANTUM_CASING;
    public static SimpleOverlayRenderer TRITANIUM_CASING;
    public static SimpleOverlayRenderer HASTELLOY_X78_CASING;
    public static SimpleOverlayRenderer HASTELLOY_N_CASING;
    public static SimpleOverlayRenderer INCOLOY_813_CASING;

    public static SimpleOverlayRenderer ENRICHED_NAQUADAH_ALLOY_CASING;

    private ClientHandler() {
    }

    public static void preInit() {
        BIO_REACTOR = new SimpleOverlayRenderer("casings/solid/bio_reactor_casing");
        FUSION_TEXTURE = new SimpleOverlayRenderer("casings/fusion/machine_casing_fusion_glass");

        ORGANIC_REPLICATOR_OVERLAY = new OrientedOverlayRenderer("machines/organic_replicator");
        FUSION_REACTOR_OVERLAY = new OrientedOverlayRenderer("machines/fusion_reactor");
        QUBIT_COMPUTER_OVERLAY = new OrientedOverlayRenderer("machines/qubit_computer");

        //MetaCasing1
        STABALLOY_CASING = new SimpleOverlayRenderer("casings/metal_casings/staballoy");
        QUANTUM_CASING = new SimpleOverlayRenderer("casings/metal_casings/quantum");
        TRITANIUM_CASING = new SimpleOverlayRenderer("casings/metal_casings/tritanium");

        //MetalCasing2
        HASTELLOY_X78_CASING = new SimpleOverlayRenderer("casings/metal_casings/hastelloy_x78");
        HASTELLOY_N_CASING = new SimpleOverlayRenderer("casings/metal_casings/hastelloy_n");
        INCOLOY_813_CASING = new SimpleOverlayRenderer("casings/metal_casings/incoloy_813");
        ENRICHED_NAQUADAH_ALLOY_CASING = new SimpleOverlayRenderer("casings/metal_casings/enriched_naquadah_alloy");

    }
}
