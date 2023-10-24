package com.provismet.extrade_oa.powers;

import com.provismet.extrade_oa.ExtraDE_OA;
import com.provismet.extrade_oa.SerializableDataTypeOverride;

import io.github.apace100.apoli.power.PowerType;
import io.github.apace100.apoli.power.SetEntityGroupPower;
import io.github.apace100.apoli.power.factory.PowerFactory;
import io.github.apace100.calio.data.SerializableData;
import io.github.apace100.calio.data.SerializableDataTypes;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.LivingEntity;

public class SetExtraEntityGroup extends SetEntityGroupPower {
    public SetExtraEntityGroup(PowerType<?> type, LivingEntity entity, EntityGroup group, int priority) {
        super(type, entity, group, priority);
    }

    @SuppressWarnings("rawtypes")
    public static PowerFactory createFactory () {
        return new PowerFactory<>(ExtraDE_OA.powerID("entity_group"),
            new SerializableData()
                .add("group", SerializableDataTypeOverride.ENTITY_GROUP)
                .add("priority", SerializableDataTypes.INT, 0),
        data -> (type, player) -> new SetEntityGroupPower(type, player,
            (EntityGroup)data.get("group"),
            data.getInt("priority")
        )).allowCondition();
    }
}
