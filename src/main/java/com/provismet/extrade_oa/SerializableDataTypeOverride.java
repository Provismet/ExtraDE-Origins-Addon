package com.provismet.extrade_oa;

import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableMap;
import com.provismet.extradamageenchants.group.ExtraGroup;

import io.github.apace100.calio.data.SerializableDataType;
import net.minecraft.entity.EntityGroup;

public class SerializableDataTypeOverride {
    public static final SerializableDataType<EntityGroup> ENTITY_GROUP =
        SerializableDataType.mapped(EntityGroup.class, HashBiMap.create(ImmutableMap.of(
            "default", EntityGroup.DEFAULT,
            "undead", EntityGroup.UNDEAD,
            "arthropod", EntityGroup.ARTHROPOD,
            "illager", EntityGroup.ILLAGER,
            "aquatic", EntityGroup.AQUATIC,
            "humanoid", ExtraGroup.HUMANOID,
            "outerworldly", ExtraGroup.OUTERWORDLY,
            "arcane", ExtraGroup.ARCANE,
            "fungifloral", ExtraGroup.FUNGIFLORAL,
            "beastly", ExtraGroup.BEASTLY
        )));
}
