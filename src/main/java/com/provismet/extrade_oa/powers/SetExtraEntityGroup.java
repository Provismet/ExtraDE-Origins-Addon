package com.provismet.extrade_oa.powers;

import com.provismet.extrade_oa.ExtraDE_OA;
import com.provismet.extrade_oa.SerializableDataTypeOverride;

import io.github.apace100.apoli.power.PowerType;
import io.github.apace100.apoli.power.SetEntityGroupPower;
import io.github.apace100.apoli.power.factory.PowerFactory;
import io.github.apace100.calio.data.SerializableData;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.LivingEntity;

public class SetExtraEntityGroup extends SetEntityGroupPower {
    public SetExtraEntityGroup(PowerType<?> type, LivingEntity entity, EntityGroup group) {
        super(type, entity, group);
    }

    @SuppressWarnings("rawtypes")
    public static PowerFactory createFactory () {
        return new PowerFactory<>(ExtraDE_OA.powerID("entity_group"),
        new SerializableData()
            .add("group", SerializableDataTypeOverride.ENTITY_GROUP),
        data ->
            (type, player) -> new SetEntityGroupPower(type, player, (EntityGroup)data.get("group")))
        .allowCondition();
    }
}
