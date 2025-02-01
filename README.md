# ExtraDE Origins Addon
[![Image](https://img.shields.io/badge/license-MIT-green?style=flat-square)](https://github.com/Provismet/ExtraDE-Origins-Addon/blob/1.20/LICENSE)
![Image](https://img.shields.io/badge/environment-both-4caf50?style=flat-square)
![Image](https://img.shields.io/badge/mod%20loader-fabric/quilt-d64541?style=flat-square)  
This Origins addon allows you to grant an Origin one of the entity groups defined by [Extra Damage Enchantments](https://github.com/Provismet/Extra-Damage-Enchantments).  

Note: With the removal of entity groups in Minecraft 1.21 and the introduction of a new entity type tag in Origins/Apoli, this mod is likely to not
be useful in the future and have its power JSONs absorbed into the baseline Extra Damage Enchantments mod.  
ExtraDEOA directly depends on Origins, whereas ExtraDE is more stable and standalone. ExtraDEOA will stay around for now until Origins 1.13 fully releases
and a decision for how to handle it going forward can be made.

## Powers
This mod creates a new power type `extrade:entity_group` that works identically to the standard `origins:entity_group` power type, but with additional options.  
Concrete power implementations are already provided by the mod, to use them add one of these to your origin:
- `extrade:humanoid`
- `extrade:outerworldly`
- `extrade:arcane`
- `extrade:fungifloral`
- `extrade:beastly`

### Vanilla Groups
ExtraDE Origins addon also adds concrete implementations to use any vanilla entity group.
- `extrade:default`
- `extrade:aquatic`
- `extrade:arthropod`
- `extrade:illager`
- `extrade:undead`

Check the [wiki](https://github.com/Provismet/ExtraDE-Origins-Addon/wiki) for more information if needed.

## Dependencies
- [Extra Damage Enchantments](https://github.com/Provismet/Extra-Damage-Enchantments)
- [Origins](https://github.com/apace100/origins-fabric)

## Download Links
- [Modrinth](https://modrinth.com/mod/extrade-origins-addon)
- [CurseForge](https://www.curseforge.com/minecraft/mc-mods/extrade-origins-addon)

Use these links to better support the mod.
