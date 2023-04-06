import preInit.Utility.Array.arrayGC


// --- Добавление
// Лунный камень
ore('stoneMoon').add(item('galacticraftcore:basic_block_moon:4'))

// Сухой лед
ore('blockDryIce').add(item('extraplanets:iapetus:6'))

// Парашуты
for (gcParachute in arrayGC.gcParachute) {
    ore('gc.parachute').add(gcParachute)
    if (gcParachute == item('galacticraftcore:parachute')) {}
    else {
        ore('gc.parachute.colors').add(gcParachute)
    }
}

// Балоны
for (oxygenTankLight in arrayGC.oxygenTankLight) {
    ore('gc.oxygen.tank.light').add(oxygenTankLight)
    if (oxygenTankLight == item('extraplanets:oxygen_tank_light_full_white')) {}
    else {
        ore('gc.oxygen.tank.light.colors').add(oxygenTankLight)
    }
}
for (oxygenTankMed in arrayGC.oxygenTankMed) {
    ore('gc.oxygen.tank.med').add(oxygenTankMed)
    if (oxygenTankMed == item('extraplanets:oxygen_tank_med_full_white')) {}
    else {
        ore('gc.oxygen.tank.med.colors').add(oxygenTankMed)
    }
}
for (oxygenTankHeavy in arrayGC.oxygenTankHeavy) {
    ore('gc.oxygen.tank.heavy').add(oxygenTankHeavy)
    if (oxygenTankHeavy == item('extraplanets:oxygen_tank_heavy_full_white')) {}
    else {
        ore('gc.oxygen.tank.heavy.colors').add(oxygenTankHeavy)
    }
}

ore('logWood').add([
    item('extraplanets:kepler22b_maple_logs:2'),
    item('extraplanets:kepler22b_maple_logs:3'),
    item('extraplanets:kepler22b_maple_logs:1'),
    item('extraplanets:kepler22b_maple_logs'),
    item('extraplanets:kepler22b_maple_logs2:1'),
    item('extraplanets:kepler22b_maple_logs2')
])

ore('plankWood').add([
    item('extraplanets:kepler22b_planks:4'),
    item('extraplanets:kepler22b_planks:1'),
    item('extraplanets:kepler22b_planks:3'),
    item('extraplanets:kepler22b_planks:2'),
    item('extraplanets:kepler22b_planks'),
    item('extraplanets:kepler22b_planks:5')
])

ore('gravel').add([
    item('extraplanets:titania_gravel'),
    item('extraplanets:deimos_gravel'),
    item('extraplanets:io_gravel'),
    item('extraplanets:europa_gravel'),
    item('extraplanets:eris_gravel'),
    item('extraplanets:pluto_gravel'),
    item('extraplanets:saturn_gravel'),
    item('extraplanets:jupiter_gravel'),
    item('extraplanets:ceres_gravel'),
    item('extraplanets:mercury_gravel'),
    item('extraplanets:iapetus_gravel'),
    item('extraplanets:titania_gravel'),
    item('extraplanets:oberon_gravel'),
    item('extraplanets:titan_gravel'),
    item('extraplanets:rhea_gravel'),
    item('extraplanets:ganymede_gravel'),
    item('extraplanets:callisto_gravel'),
    item('extraplanets:triton_gravel'),
    item('extraplanets:phobos_gravel')
])

// Дэш
ore('stickDesh').add(item('galacticraftplanets:item_basic_mars', 1))

// Плотный лед
ore('blockDenseIce').add(item('galacticraftplanets:dense_ice'))

// Метеоритное железо
ore('blockMeteoricIron').add(item('galacticraftcore:basic_block_core', 12))

// --- Удаление

// Iron
ore('oreIron').remove(item('galacticraftplanets:mars', 3))
ore('oreIron').remove(item('galacticraftplanets:asteroids_block', 5))

// Copper
ore('oreCopper').remove([
    item('galacticraftcore:basic_block_moon'),
    item('galacticraftplanets:mars'),
    item('galacticraftcore:basic_block_core', 5),
    item('galacticraftplanets:venus', 7)
    ])
ore('ingotCopper').remove(item('galacticraftcore:basic_item', 3))
ore('blockCopper').remove(item('galacticraftcore:basic_block_core', 9))

// Tin
ore('oreTin').remove([
    item('galacticraftcore:basic_block_moon', 1),
    item('galacticraftplanets:mars', 1),
    item('galacticraftplanets:venus', 11),
    item('galacticraftcore:basic_block_core', 6)
    ])
ore('ingotTin').remove(item('galacticraftcore:basic_item', 4))
ore('blockTin').remove(item('galacticraftcore:basic_block_core', 10))

// Aluminium/Aluminum etc
ore('oreAluminium').remove([
    item('galacticraftplanets:asteroids_block', 3),
    item('galacticraftcore:basic_block_core', 7),
    item('galacticraftplanets:venus', 6)
    ])
ore('oreAluminum').remove([
    item('galacticraftplanets:asteroids_block', 3),
    item('galacticraftcore:basic_block_core', 7),
    item('galacticraftplanets:venus', 6)
    ])
ore('oreNaturalAluminum').remove([
    item('galacticraftplanets:asteroids_block', 3),
    item('galacticraftcore:basic_block_core', 7),
    item('galacticraftplanets:venus', 6)
    ])
ore('ingotAluminum').remove(item('galacticraftcore:basic_item', 5))
ore('blockAluminum').remove(item('galacticraftcore:basic_block_core', 11))
ore('blockAluminium').remove(item('galacticraftcore:basic_block_core', 11))

// Солнечная руда
ore('oreSolar').remove(item('galacticraftplanets:venus', 13))

// Дэш
ore('oreDesh').remove(item('galacticraftplanets:mars', 2))

// Кремний
ore('oreSilicon').remove(
    item('galacticraftplanets:venus', 10),
    item('galacticraftcore:basic_block_core', 8)
    )
ore('blockSilicon').remove(item('galacticraftcore:basic_block_core', 13))

// Квартц
ore('oreQuartz').remove(item('galacticraftplanets:venus', 9))

// Lead
ore('oreLead').remove(item('galacticraftplanets:venus', 8))
ore('ingotLead').remove(item('galacticraftplanets:basic_item_venus', 1))
ore('blockLead').remove(item('galacticraftplanets:venus', 12))

// Ilmenite
ore('oreIlmenite').remove(item('galacticraftplanets:asteroids_block', 4))

// Титан
ore('dustTitanium').remove(item('galacticraftplanets:item_basic_asteroids', 9))
ore('ingotTitanium').remove(item('galacticraftplanets:item_basic_asteroids'))
ore('blockTitanium').remove(item('galacticraftplanets:asteroids_block', 7))

// Сыр
ore('foodCheese').remove(item('galacticraftcore:cheese_curd'))