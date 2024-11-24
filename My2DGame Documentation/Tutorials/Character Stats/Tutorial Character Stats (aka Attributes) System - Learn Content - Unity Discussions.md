 

                                                          image/svg+xml Xbox Logo

[Skip to main content](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458#main-container)

  

[![Unity Discussions](HTML%20import/Attachments/logo.svg)](https://discussions.unity.com/)

# [[Tutorial] Character Stats (aka Attributes) System](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458)

[Learn Content](https://discussions.unity.com/c/learn/50)

1. [Products](https://unity.com/products)
2. [Solutions](https://unity.com/use-cases)
3. [Resources](https://unity.com/resources)
4. [Community](https://unity.com/community)
5. [Learn](https://unity.com/learn)
6. [Support](https://unity.com/help)

​

Log In

- ​
- ​

- [Discussions Home](https://discussions.unity.com/)
- [Search](https://discussions.unity.com/search?expanded=true)
- [Latest Topics](https://discussions.unity.com/latest "All topics")
- [Top Topics](https://discussions.unity.com/top)
- [Bookmarks](https://discussions.unity.com/bookmarks)
- More

Community Links

- [Blog](https://blog.unity.com/)
- [Issue Tracker](https://issuetracker.unity3d.com/)
- [Learn](https://unity.com/learn)
- [Documentation](https://docs.unity.com/)
- [Unity Asset Store](https://assetstore.unity.com/)
- [User Groups](https://unity.com/community/user-groups)
- [Advocates](https://unity.com/community/advocates)
- [Unity Pulse](https://unity.com/unity-pulse)
- [Events](https://unity.com/events-hub)
- [Creator Spotlight](https://resources.unity.com/creator-spotlight)
- [Made with Unity](https://unity.com/made-with-unity)
- [Play](https://play.unity.com/)
- [LinkedIn](https://www.linkedin.com/company/unity-technologies)
- [YouTube](https://www.youtube.com/user/Unity3D)
- [X](https://x.com/unity)
- [Discord](https://discord.gg/unity)
- [Instagram](https://www.instagram.com/unitytechnologies/)
- [Twitch](https://www.twitch.tv/unity)

Quick Links

- [Getting Started](https://discussions.unity.com/c/getting-started/48 "If you’re new to Unity and Unity Discussions, you can ask for pointers in this category.")
- [Learn Content](https://discussions.unity.com/c/learn/50 "Discuss Official Unity Learn content, learning events, and community-created tutorials/sample projects here!")
- [Technical Articles](https://discussions.unity.com/c/technical-articles/23 "Welcome to the Technical Articles category.")
- [Community Showcases](https://discussions.unity.com/c/community-showcases/47 "Show off your creations and share them with the Unity community, including Made with Unity Games, etc.")
- [News & General Discussion](https://discussions.unity.com/c/industries-news-general-discussion/49 "Discuss Unity and the industries it serves in general. This is NOT a support forum.")
- [All categories](https://discussions.unity.com/categories)

Tags

- [Broken Code Format](https://discussions.unity.com/tag/Broken-Code-Format)
- [Broken Image](https://discussions.unity.com/tag/Broken-Image)
- [Broken Link](https://discussions.unity.com/tag/Broken-Link)
- [All tags](https://discussions.unity.com/tags)

​

​

​

Black Friday has arrived! **Save 50%** **on more than 300** of the most popular assets on the Unity Asset Store. Plus, get up to **70% off daily Flash Deals.** [Learn more.](https://assetstore.unity.com/?on_sale=true&orderBy=1&rows=96)

# [[Tutorial] Character Stats (aka Attributes) System](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458)

[Learn Content](https://discussions.unity.com/c/learn/50)

You have selected **0** posts.

[select all](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458)

[cancel selecting](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458)

[Nov 2017](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458/1 "Jump to the first post")

1 / 66

Nov 2017

[Jan 4](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458/66)

[![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/272373_2.png)](https://discussions.unity.com/u/Kryzarel)

[Kryzarel](https://discussions.unity.com/u/Kryzarel)

1

[Nov 2017](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458 "Post date")

What up fellow devs, hope all is well, I’d like to share with you an implementation for a sats (aka attributes) system.  
Below, you’ll find the tutorial in both video and text formats.

**DOWNLOAD THE ASSET (it’s free!):**  
**[https://assetstore.unity.com/packages/tools/integration/character-stats-106351](https://assetstore.unity.com/packages/tools/integration/character-stats-106351)**

Video version:  
Chapter 1

![](HTML%20import/Attachments/95e606c020d649f0a656806d59d992f1ae25725a.jpeg "Character Stats in Unity #1 - Base Implementation")

[Character Stats in Unity #1 - Base Implementation](https://www.youtube.com/watch?v=SH25f3cXBVc "Character Stats in Unity #1 - Base Implementation")

Chapter 2

![](HTML%20import/Attachments/d0a08608fedcd1b1bcab45a2907f4fd878bc7738.jpeg "Character Stats in Unity #2 - Additive Percent Modifiers & Optimizations")

[Character Stats in Unity #2 - Additive Percent Modifiers & Optimizations](https://www.youtube.com/watch?v=uvOSx5FzDnU "Character Stats in Unity #2 - Additive Percent Modifiers & Optimizations")

Chapter 3

![](HTML%20import/Attachments/d6e10cde21763054748d390ca992069f668fdc21.jpeg "Character Stats in Unity #3 - Final Adjustments & Asset Store Announcement")

[Character Stats in Unity #3 - Final Adjustments & Asset Store Announcement](https://www.youtube.com/watch?v=obxBk2pSR5U "Character Stats in Unity #3 - Final Adjustments & Asset Store Announcement")

Chapter 1:  
![](a7d6ffcd67ccfc7e9c42d372ac36ebd76e75ac25.jpeg)  
Final Fantasy stat sheet.

Stats like Strength, Intelligence, Dexterity, have become staples in many games. And when we’re getting +5 Strength from an item, -10% from a debuff and +15% from a talent, it’s nice to have a system that keeps track of all those modifiers in an organized fashion.

Before starting, gotta give credit where credit is due, my implementation was heavily inspired by **[this article](https://gamedevelopment.tutsplus.com/tutorials/using-the-composite-design-pattern-for-an-rpg-attributes-system--gamedev-243)**. It’s a Flash tutorial with all code written in ActionScript, but in any case, the concept is great.

For the basics of this system we need a class that represents a stat, with a variable for the base stat value, and a list to store all the individual modifiers that have been applied to that stat. We also need a class to represent stat modifiers:

`using System.Collections.Generic; public class CharacterStat {     public float BaseValue;       private readonly List<StatModifier> statModifiers;     public CharacterStat(float baseValue)     {         BaseValue = baseValue;         statModifiers = new List<StatModifier>();     } }`

`public class StatModifier {     public readonly float Value;     public StatModifier(float value)     {         Value = value;     } }`

What’s readonly?

When a variable is declared as readonly, it can only be assigned a value when it’s declared, or inside the constructor of its class. The compiler throws an error otherwise.

This prevents us from unintentionally doing things like

`statModifiers = new List<StatModifier>(); statModifiers = null;`

at some other point in the code.

If at any moment we need a fresh empty list, we can always just call _statModifiers.Clear()_.

Note how none of these classes derive from _MonoBehaviour_. We won’t be attaching them to game objects.

Even though stats are usually whole numbers, I’m using floats instead of ints because when applying percentage bonuses, we can easily end up with decimal numbers. This way, the stat exposes the value more accurately, and then we can do whatever rounding we see fit. Besides, if we actually do want a stat that is not a whole number, it’s already covered.

Now we need to be able to add and remove modifiers to/from stats, calculate the final value of the stat (taking into account all those modifiers) and also fetch the final value. Let’s add this to the _CharacterStat_ class:

`public float Value { get { return CalculateFinalValue(); } } public void AddModifier(StatModifier mod) {     statModifiers.Add(mod); } public bool RemoveModifier(StatModifier mod) {     return statModifiers.Remove(mod); } private float CalculateFinalValue() {     float finalValue = BaseValue;     for (int i = 0; i < statModifiers.Count; i++)     {         finalValue += statModifiers[i].Value;     }     // Rounding gets around dumb float calculation errors (like getting 12.0001f, instead of 12f)     // 4 significant digits is usually precise enough, but feel free to change this to fit your needs     return (float)Math.Round(finalValue, 4); }`

We’ll also need to add this outside the class curly braces (right at the top of the script):

`using System;`

If you’re like me, the fact that we’re calling _CalculateFinalValue()_ every single time we need the stat value is probably bugging you. Let’s avoid that by making the following changes:

`// Add these variables private bool isDirty = true; private float _value; // Change the Value property to this public float Value {     get {         if(isDirty) {             _value = CalculateFinalValue();             isDirty = false;         }         return _value;     } } // Change the AddModifier method public void AddModifier(StatModifier mod) {     isDirty = true;     statModifiers.Add(mod); } // And change the RemoveModifier method public bool RemoveModifier(StatModifier mod) {     isDirty = true;     return statModifiers.Remove(mod); }`

Great, we can add “flat” modifiers to our stats, but what about percentages? Ok, so that means there’s at least 2 types of stat modifiers, let’s create an enum to define those types:

`public enum StatModType {     Flat,     Percent, }`

You can either put this in a new script or in the same script as the _StatModifier_ class (outside the class curly braces for easier access).

We need to change our _StatModifier_ class to take these types into account:

`public class StatModifier {     public readonly float Value;     public readonly StatModType Type;     public StatModifier(float value, StatModType type)     {         Value = value;         Type = type;     } }`

And change our _CalculateFinalValue()_ method in the _CharacterStat_ class to deal with each type differently:

`private float CalculateFinalValue() {     float finalValue = BaseValue;     for (int i = 0; i < statModifiers.Count; i++)     {         StatModifier mod = statModifiers[i];         if (mod.Type == StatModType.Flat)         {             finalValue += mod.Value;         }         else if (mod.Type == StatModType.Percent)         {             finalValue *= 1 + mod.Value;         }     }     // Rounding gets around dumb float calculation errors (like getting 12.0001f, instead of 12f)     // 4 significant digits is usually precise enough, but feel free to change this to fit your needs     return (float)Math.Round(finalValue, 4); }`

Why is the percentage calculation so weird?

Let’s say we have a value of 20 and we want to add +10% to that.

> We can first figure out much 10% is by multiplying by 0.1:  
> 20 * 0.1 = 2  
> Then we add the result of that to the original value:  
> 20 + 2 = 22

With this in mind, that weird line of code could be written like this:

`finalValue += finalValue * mod.Value;`

However, since the original value is always 100%, and we want to add 10% to that, it’s easy to see that would make it 110%.

> That means we can add the percentages together first:  
> 1 + 0.1 = 1.1  
> And then multiply the original value by the result:  
> 20 * 1.1 = 22

This works for negative numbers too, if we want to modify by -10%, it means we’ll be left with 90%, so we multiply by 0.9.

Now we can deal with percentages, but our modifiers always apply in the order they are added to the list. If we have a skill or talent that increases our Strength by 15%, if we then equip an item with +20 Strength after gaining that skill, those +15% won’t apply to the item we just equipped. That’s probably not what we want. We need a way to tell the stat the order in which modifiers take effect.  
Let’s do that by making the following changes to the StatModifier class:

`// Add this variable to the top of the class public readonly int Order; // Change the existing constructor to look like this public StatModifier(float value, StatModType type, int order) {     Value = value;     Type = type;     Order = order; } // Add a new constructor that automatically sets a default Order, in case the user doesn't want to manually define it public StatModifier(float value, StatModType type) : this(value, type, (int)type) { }`

What the hell is up with that constructor?

In C#, to call a constructor from another constructor, you essentially “extend” the constructor you want to call.  
In this case we defined a constructor that needs only the _value_ and the _type_, it then calls the constructor that also needs the _order_, but passes the _int_ representation of _type_ as the default order.

How does **_(int)type_** work?  
In C#, every enum element is automatically assigned an index. By default, the first element is 0, the second is 1, etc. You can assign a custom index if you want, but we don’t need to do that…yet. If you hover your mouse over an enum element, you can see the index of that element in the tooltip (at least in Visual Studio).  
In order to retrieve the index of an enum element, we just cast it to _int_.

With these changes, we can set the _order_ for each modifier, but if we don’t, flat modifiers will apply before percentage modifiers. So by default we get the most common behavior, but we can also do other things, like forcing a special modifier to apply a flat value after everything else.

Now we need a way to apply modifiers according to their order when calculating the final stat value. The easiest way to do this is to sort the _statModifiers_ list whenever we add a new modifier. This way we don’t need to change the _CalculateFinalValue()_ method because everything will already be in the correct order.

`// Change the AddModifiers method to this public void AddModifier(StatModifier mod) {     isDirty = true;     statModifiers.Add(mod);     statModifiers.Sort(CompareModifierOrder); } // Add this method to the CharacterStat class private int CompareModifierOrder(StatModifier a, StatModifier b) {     if (a.Order < b.Order)         return -1;     else if (a.Order > b.Order)         return 1;     return 0; // if (a.Order == b.Order) }`

How do Sort & CompareModifierOrder work?

_Sort()_ is a C# method for all lists that, as the name implies, sorts the list. The criteria it uses to sort the list should be supplied by us, in the form of a comparison function. If we don’t supply a comparison function, it uses the default comparer (whatever that does).

The comparison function will be used by the _Sort()_ method to compare pairs of objects in the list. For each pair of objects there’s 3 possible situations:

1. The first object (_a_) should come **before** the second object (_b_). The function returns **-1**.
2. The first object should come **after** the second. The function returns **1**.
3. Both objects are **equal** in “priority”. The function returns **0**.

In our case, the comparison function is _CompareModifierOrder()_.

Chapter 1 ends here, we already have a pretty good basis for a stat system. Feel free to take a break and/or pat yourself on the back for reaching this point ![:slight_smile:](HTML%20import/Attachments/slight_smile.png ":slight_smile:")

Chapter 2:

Right now our percentage modifiers stack multiplicatively with each other, i.e., if we add two 100% modifiers to a stat, we won’t get 200%, we’ll get 400%. Because the first will double our original value (going from 100% to 200%), and the second will double it again (going from 200% to 400%).  
But what if we would like to have certain modifiers stack additively? Meaning that the previous example would result in a 200% bonus instead of 400%.

Let’s add a third type of modifier by changing our _StatModType_ enum to this:

`public enum StatModType {     Flat,     PercentAdd, // Add this new type.     PercentMult, // Change our old Percent type to this. }`

Don’t forget to change _Percent_ to _PercentMult_ in the _CalculateFinalValue()_ method (inside the _CharacterStat_ class). Or just use Visual Studio’s renaming features to do it for you ^^.

Inside the _CalculateFinalValue()_ method, we need to add a couple of things to deal with the new type of modifier. It should now look like this:

`private float CalculateFinalValue() {     float finalValue = BaseValue;     float sumPercentAdd = 0; // This will hold the sum of our "PercentAdd" modifiers     for (int i = 0; i < statModifiers.Count; i++)     {         StatModifier mod = statModifiers[i];         if (mod.Type == StatModType.Flat)         {             finalValue += mod.Value;         }         else if (mod.Type == StatModType.PercentAdd) // When we encounter a "PercentAdd" modifier         {             sumPercentAdd += mod.Value; // Start adding together all modifiers of this type             // If we're at the end of the list OR the next modifer isn't of this type             if (i + 1 >= statModifiers.Count || statModifiers[i + 1].Type != StatModType.PercentAdd)             {                 finalValue *= 1 + sumPercentAdd; // Multiply the sum with the "finalValue", like we do for "PercentMult" modifiers                 sumPercentAdd = 0; // Reset the sum back to 0             }         }         else if (mod.Type == StatModType.PercentMult) // Percent renamed to PercentMult         {             finalValue *= 1 + mod.Value;         }     }     return (float)Math.Round(finalValue, 4); }`

This time the calculation gets pretty weird. Basically, every time we encounter a _PercentAdd_ modifier, we start adding it together with all modifiers of the same type, until we encounter a modifier of a different type or we reach the end of the list. At that point, we grab the sum of all the _PercentAdd_ modifiers and multiply it with _finalValue_, just like we do with _PercentMult_ modifiers.

For the next bit, let’s add a _Source_ variable to our _StatModifier_ class. This way, later on when we actually have stuff in our game that adds modifiers (like items and spells), we’ll be able to tell where each modifier came from.  
This could be useful both for debugging and also to provide more information to the players, allowing them to see exactly what is providing each modifier.

The _StatModifier_ class should look like this:

`public readonly float Value; public readonly StatModType Type; public readonly int Order; public readonly object Source; // Added this variable // "Main" constructor. Requires all variables. public StatModifier(float value, StatModType type, int order, object source) // Added "source" input parameter {     Value = value;     Type = type;     Order = order;     Source = source; // Assign Source to our new input parameter } // Requires Value and Type. Calls the "Main" constructor and sets Order and Source to their default values: (int)type and null, respectively. public StatModifier(float value, StatModType type) : this(value, type, (int)type, null) { } // Requires Value, Type and Order. Sets Source to its default value: null public StatModifier(float value, StatModType type, int order) : this(value, type, order, null) { } // Requires Value, Type and Source. Sets Order to its default value: (int)Type public StatModifier(float value, StatModType type, object source) : this(value, type, (int)type, source) { }`

Let’s say we equipped an item that grants both a flat +10 and also a +10% bonus to Strength. The way the system works currently, we have to do something like this:

`public class Item // Hypothetical item class {     public void Equip(Character c)     {         // We need to store our modifiers in variables before adding them to the stat.         mod1 = new StatModifier(10, StatModType.Flat);         mod2 = new StatModifier(0.1, StatModType.Percent);         c.Strength.AddModifier(mod1);         c.Strength.AddModifier(mod2);     }     public void Unequip(Character c)     {         // Here we need to use the stored modifiers in order to remove them.         // Otherwise they would be "lost" in the stat forever.         c.Strength.RemoveModifier(mod1);         c.Strength.RemoveModifier(mod2);     } }`

But now that our modifiers have a _Source_, we can do something useful in _CharacterStat_ - we can remove all modifiers that have been applied by a certain _Source_ at once. Let’s add a method for that:

`public bool RemoveAllModifiersFromSource(object source) {     bool didRemove = false;     for (int i = statModifiers.Count - 1; i >= 0; i--)     {         if (statModifiers[i].Source == source)         {             isDirty = true;             didRemove = true;             statModifiers.RemoveAt(i);         }     }     return didRemove; }`

Why is the “for” loop in reverse?

To explain this let’s look at what happens when we remove the first object from a list **_vs_** when we remove the last object:  
Let’s say we have a list with 10 objects, when we remove the first one, the remaining 9 objects will be shifted up. That happens because index 0 is now empty, so the object at index 1 will move to index 0, the object at index 2 will move to index 1, and so on. As you can imagine, this is quite inefficient.  
However, if we remove the last object, then nothing has to be shifted. We just remove the object at index 9 and everything else stays the same.

This is why we do the removal in reverse. Even if the objects that we need to remove are in the middle of the list (where shifts are inevitable), it’s still a good idea to traverse the list in reverse (unless your specific use case demands otherwise). Any time more than one object is removed, doing it from last to first always results in less shifts.

And now we can add and remove our (hypothetical) item’s modifiers like so:

`public class Item {     public void Equip(Character c)     {         // Create the modifiers and set the Source to "this"         // Note that we don't need to store the modifiers in variables anymore         c.Strength.AddModifier(new StatModifier(10, StatModType.Flat, this));         c.Strength.AddModifier(new StatModifier(0.1, StatModType.Percent, this));     }     public void Unequip(Character c)     {         // Remove all modifiers applied by "this" Item         c.Strength.RemoveAllModifiersFromSource(this);     } }`

Since we’re talking about removing modifiers, let’s also “fix” our original _RemoveModifier()_ method. We really don’t need to set _isDirty_ every single time, just when something is actually removed.

`public bool RemoveModifier(StatModifier mod) {     if (statModifiers.Remove(mod))     {         isDirty = true;         return true;     }     return false; }`

We also talked about letting players see the modifiers, but the _statModifiers_ list is private. We don’t want to change that because the only way to safely modify it is definitely through the _CharacterStat_ class. Fortunately, C# has a very useful data type for these situations: _ReadOnlyCollection_.

Make the following changes to _CharacterStat_:

`using System.Collections.ObjectModel; // Add this using statement public readonly ReadOnlyCollection<StatModifier> StatModifiers; // Add this variable public CharacterStat(float baseValue) {     BaseValue = baseValue;     statModifiers = new List<StatModifier>();     StatModifiers = statModifiers.AsReadOnly(); // Add this line to the constructor }`

The _ReadOnlyCollection_ stores a reference to the original _List_ and prohibits changing it. However, if you modify the original _statModifiers_ (lowercase s), then the _StatModifiers_ (uppercase S) will also change.

To finish up chapter 2, I’d like to add just two more things. We left the _BaseValue_ as public, but if we change its value it won’t cause the _Value_ property to recalculate. Let’s fix that.

`// Add this variable private float lastBaseValue = float.MinValue; // Change Value public float Value {     get {         if(isDirty || lastBaseValue != BaseValue) {             lastBaseValue = BaseValue;             _value = CalculateFinalValue();             isDirty = false;         }         return _value;     } }`

The other thing is in the _StatModType_ enum. Let’s override the default “indexes” like so:

`public enum StatModType {     Flat = 100,     PercentAdd = 200,     PercentMult = 300, }`

The reason for doing this is simple - if someone wants to add a custom _Order_ value for some modifiers to sit in the middle of the default ones, this allows a lot more flexibility.

If we want to add a _Flat_ modifier that applies between _PercentAdd_ and _PercentMult_, we can just assign an _Order_ anywhere between 201 and 299. Before we made this change, we’d have to assign custom _Order_ values to all _PercentAdd_ and _PercentMult_ modifiers too.

Chapter 3:

This is gonna be a short one, the only thing left to do is make the classes more easily extendable. To do that, we’ll change all _private_ variables, properties and methods to _protected_, in addition to making all properties and methods _virtual_.

Only the _CharacterStat_ script needs changes, and I’m showing only the lines that need to be changed:

`protected bool isDirty = true; protected float lastBaseValue; protected float _value; public virtual float Value {} protected readonly List<StatModifier> statModifiers; public virtual void AddModifier(StatModifier mod); public virtual bool RemoveModifier(StatModifier mod); public virtual bool RemoveAllModifiersFromSource(object source); protected virtual int CompareModifierOrder(StatModifier a, StatModifier b); protected virtual float CalculateFinalValue();`

Let’s also mark the _CharacterStat_ class as _[Serializable]_, so that we can actually edit it from the Unity inspector.

`[Serializable] public class CharacterStat`

And on that note, we also need to implement a parameterless constructor for _CharacterStat_, otherwise we’re gonna get a null reference exception due to _statModifiers_ not being initialized.  
Let’s change our original constructor and add the new one:

`public CharacterStat() {     statModifiers = new List<StatModifier>();     StatModifiers = statModifiers.AsReadOnly(); } public CharacterStat(float baseValue) : this() {     BaseValue = baseValue; }`

Other than that, I’ve also put both classes inside a _namespace_:

`namespace Kryz.CharacterStats {     [Serializable]     public class CharacterStat     {         //...     } }`

`namespace Kryz.CharacterStats {     public enum StatModType     {         //...     }     public class StatModifier     {         //...     } }`

You don’t need to do this if you don’t want to, but I like it for organization reasons.

I will be reading and replying to every comment in this thread, so don’t hesitate to drop a comment if you have any questions, suggestions or feedback. I hope this has been helpful, and goodbye for now!

37

- [What's the best way to build Stats system and Save/Load your Stats?](https://discussions.unity.com/t/whats-the-best-way-to-build-stats-system-and-save-load-your-stats/928623/9)
- [Designing scattered stats/attributes](https://discussions.unity.com/t/designing-scattered-stats-attributes/875089)
- [50% OFF Game Kit Controller: Engine with melee, weapons, vehicles, crafting & more! 3.77c](https://discussions.unity.com/t/released-game-kit-controller-engine-with-melee-weapons-vehicles-crafting-more-3-76/595741/1592)
- [Damage Modifiers](https://discussions.unity.com/t/damage-modifiers/940721/5)
- [Stats modifier system](https://discussions.unity.com/t/stats-modifier-system/1556874/4)

143k views 81 likes 11 links 40 users

 [![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/272373_2.png "Kryzarel") 18](https://discussions.unity.com/u/Kryzarel "Kryzarel")

 [![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/84179_2.png "Kuuo") 3](https://discussions.unity.com/u/Kuuo "Kuuo")

 [![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/48.png "Dorscherl") 2](https://discussions.unity.com/u/Dorscherl "Dorscherl")

 [![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/478627_2.png "shanecelis") 2](https://discussions.unity.com/u/shanecelis "shanecelis")

 [![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/42_2.png "LaneFox") 2](https://discussions.unity.com/u/LaneFox "LaneFox")

read 24 min

Top replies

[![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/48(1).png)](https://discussions.unity.com/u/Zymes)

[Zymes](https://discussions.unity.com/u/Zymes)

[Nov 2017](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458/2 "Post date")

Thanks this is great.

I was just looking at how to solve this.

1

[![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/169935_2.png)](https://discussions.unity.com/u/reiniat)

[reiniat](https://discussions.unity.com/u/reiniat)

[Nov 2017](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458/3 "Post date")

Way more clear and straightforward than the link to the other tutorial.

1

[![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/272373_2.png)](https://discussions.unity.com/u/Kryzarel)

[Kryzarel](https://discussions.unity.com/u/Kryzarel)

[Nov 2017](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458/4 "Post date")

Thank you guys so much for your kind words ![:slight_smile:](HTML%20import/Attachments/slight_smile.png ":slight_smile:")

Btw, I just uploaded the [video version](https://youtu.be/SH25f3cXBVc) of this tutorial. Also edited the original post with the link.

[![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/272373_2.png)](https://discussions.unity.com/u/Kryzarel)

[Kryzarel](https://discussions.unity.com/u/Kryzarel)

[Nov 2017](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458/5 "Post date")

Apologies for the slight spam, just wanna let people know that I’ve edited the original post with chapter 2 of the tutorial. Hope you enjoy, and feel free to post your thoughts down here, I’ll be reading and replying to every comment ![:slight_smile:](HTML%20import/Attachments/slight_smile.png ":slight_smile:")

15 days later

[![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/84895_2.png)](https://discussions.unity.com/u/Saucyminator)

[Saucyminator](https://discussions.unity.com/u/Saucyminator)

[Dec 2017](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458/6 "Post date")

Great stuff! Really liked the videos, you explained things really well.

Is this up on the Asset Store? I don’t see any links. Cheers!

[![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/272373_2.png)](https://discussions.unity.com/u/Kryzarel)

[Kryzarel](https://discussions.unity.com/u/Kryzarel)

[Dec 2017](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458/7 "Post date")

[](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458/6 "go to the quoted post")

![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/84895_2.png) Saucyminator:

> Great stuff! Really liked the videos, you explained things really well.
> 
> Is this up on the Asset Store? I don’t see any links. Cheers!

Hey there, glad you liked it! I’ve already submitted the package to the asset store, but according to Unity, they’re having a large volume of submissions so it’s taking longer than usual to get approval. As soon as it’s up I’ll update the post with links.

29 days later

[![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/48(2).png)](https://discussions.unity.com/u/FuriantMedia)

[FuriantMedia](https://discussions.unity.com/u/FuriantMedia)

[Jan 2018](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458/8 "Post date")

Thank you very much for posting this. You clearly put a lot of effort into it, and it’s really educational. I had actually read the Flash-oriented article you mentioned, but the code translation was a bother and I gave up on it.

Great work!

Edit: I’ve been working to extend this so that it can represent other kinds of stats, like Resources (health, mana) which have a MaxValue. It occurred to me that Skills (swords, swimming, blacksmithing) could function very similarly: a ranged value that you check against to determine something else. In a simple scenario you could just use the same class for a skill or a health stat; it would be modifiable, etc. The only difference is presentation in the GUI.

I also wanted to be able to tell a modifier to apply to a ranged value in more ways.

- Apply to the current value as a percentage of the MaxValue (heal for 10% of your max health)
- As a buff/debuff:
- Apply _to_ the MaxValue (increases max health by 10 points)
- Apply _to_ the MaxValue as a _percent_ of the MaxValue (increases max health by 10%)

I had to split it into two somewhat redundant classes: Stat (which has no max) and Resource (which does), and then the associated StatModifier and ResourceModifier. Ideally I’d use inheritance for this, but I hear a lot about Unity’s issues with subclass serialization, especially if you want to make it a scriptable object with editor support.

Furthermore

I wanted to have modifications be applied from a ModifierGroup object, which would represent a spell or buff/debuff, status effect, etc. It would host the collection of modifiers which make up the total effect, and probably have some kind of timing model for application (Burst, OverDuration, PerTickForDuration, PerTickUntilCancel, etc.). Like: a spell that initially heals for 10% of your max health, then 1% thereafter each second for 10 seconds. Pretty simple with this system.

Anyway, if I get it fleshed out more, and you’re interested, I could upload the results.

3

[![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/272373_2.png)](https://discussions.unity.com/u/Kryzarel)

[Kryzarel](https://discussions.unity.com/u/Kryzarel)

[Jan 2018](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458/9 "Post date")

[@FuriantMedia](https://discussions.unity.com/u/furiantmedia) Thank you very much for your kind words! I’m really happy you found this useful.  
Also, damn, great work extending this. That is exactly the type of thing I wanted to facilitate with this system!

I really wanted to make it simple, powerful and easy to expand upon, and even if the code didn’t turn out like that, at least I hoped the idea would. Mission accomplished, I guess ![:smile:](HTML%20import/Attachments/smile.png ":smile:")

[![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/42_2.png)](https://discussions.unity.com/u/LaneFox)

[LaneFox](https://discussions.unity.com/u/LaneFox)Guidance Counsellor

[Jan 2018](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458/10 "Post date")

Looks like a pretty neat approach! Kudos for making something free for the community =)

Not sure how I missed this (maybe its too recent?), I couldn’t find hardly anything on the topic so I ended up making an asset published the store that does Character Stats - it takes a little different approach and offers min/max and affinities for leveling stats.

---

[Senior Unity Developer](https://www.cleverous.com/) - AEC / Gaming / Engineering / Simulation

[![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/272373_2.png)](https://discussions.unity.com/u/Kryzarel)

[Kryzarel](https://discussions.unity.com/u/Kryzarel)

[Jan 2018](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458/11 "Post date")

[@LaneFox](https://discussions.unity.com/u/lanefox) Oh that’s cool, I’m assuming that’s the “Statinator” link in your signature. Your approach seems quite good with the ScriptableObjects and referencing stats with enum values. Using enums is actually something I was wanting to do too, but never got around to it. Maybe I’ll get back to that after finishing some other tutorial series ![:slight_smile:](HTML%20import/Attachments/slight_smile.png ":slight_smile:")

If you don’t mind me asking, how do you deal with that in your asset? Do you just have a script with an enum that users need to edit? Or do you have some kind of editor window for that? What happens to it when users update the asset to a new version?

[![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/42_2.png)](https://discussions.unity.com/u/LaneFox)

[LaneFox](https://discussions.unity.com/u/LaneFox)Guidance Counsellor

[Jan 2018](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458/12 "Post date")

[](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458/11 "go to the quoted post")

![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/272373_2.png) Kryzarel:

> If you don’t mind me asking, how do you deal with that in your asset? Do you just have a script with an enum that users need to edit? Or do you have some kind of editor window for that? What happens to it when users update the asset to a new version?

Using the Enum has its own caveats, but personally I think it’s worth it. There’s other ways to get the similar results but the enum is pretty straightforward. There’s a separate script I have that stores the enum for the stats, it looks like this:

    `public enum StatType { Health, Mana, Level, Experience, ExpReward, Agility, Dexterity, Endurance, Strength, RegenHp, RegenMp }`

And thats all it contains. At first it was kinda built into core but I’m separating it in its own file out of the /core/ folder so it’s easier to maintain for users through updates.

The other enums look like this.

    `public enum StatProperty { Value, Base, Min, Max, Affinity, MaxAffinity }     public enum StatModType { Active, Direct }     public enum StatModEffect { Add, Multiply }`

And the stat class does all this wonderful magical stuff to manage everything so you can make calls like this:

        `public virtual void LevelUp()         {             Stats[(int) StatType.Level].AddToRoot(StatProperty.Value, 1);         }`

Accessing them with the int cast isn’t the prettiest (my biggest issue of doing it this way) but it’s a fast index pointer, doesn’t use strings and works great. Here’s another example.

        `public virtual void AddExp(float amount = 1000)         {             if (GetStatValue(StatType.Experience) + amount >= GetStatMax(StatType.Experience))             {                 float excess = amount - (GetStatMax(StatType.Experience) - GetStatValue(StatType.Experience));                 LevelUp();                 Stats[(int) StatType.Experience].SetRoot(StatProperty.Value, excess);             }             else Stats[(int) StatType.Experience].AddToRoot(StatProperty.Value, amount);         }`

In a different asset I was making I used code generation and a custom editor to create new Stats and regenerate a new .cs file which also worked super good and had a nice UX value but I decided to go without it for this since adding new Stats (in the enum) is more or less a one time thing done early in the project.

---

[Senior Unity Developer](https://www.cleverous.com/) - AEC / Gaming / Engineering / Simulation

[![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/272373_2.png)](https://discussions.unity.com/u/Kryzarel)

[Kryzarel](https://discussions.unity.com/u/Kryzarel)

[Jan 2018](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458/13 "Post date")

Nice, thanks for that write up! Looks pretty cool and pleasant to use. I definitely appreciate that you avoid strings.  
I’ve also thought about code generation somewhat like that, so it’s good to know it works, but I still have a lot to learn about editor scripting before trying that ![:stuck_out_tongue:](HTML%20import/Attachments/stuck_out_tongue.png ":stuck_out_tongue:")

1

13 days later

[![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/272373_2.png)](https://discussions.unity.com/u/Kryzarel)

[Kryzarel](https://discussions.unity.com/u/Kryzarel)

[Jan 2018](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458/14 "Post date")

Hey guys, just wanna let everyone know that Unity has finally **approved the asset** version of this system!

Here’s the link to the asset store page: [Unity Asset Store - The Best Assets for Game Making](https://www.assetstore.unity3d.com/#!/content/106351)

And a “how to use” video!

![](HTML%20import/Attachments/71e912fe24cdd3b87d30c54f2d3f1072062ab06f.jpeg "Character Stats - Free Unity Asset")

[Character Stats - Free Unity Asset](https://www.youtube.com/watch?v=riNEDNgGqIg "Character Stats - Free Unity Asset")

6

[![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/48(3).png)](https://discussions.unity.com/u/Duffer123_1)

[Duffer123_1](https://discussions.unity.com/u/Duffer123_1)

[Jan 2018](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458/15 "Post date")

[@Kryzarel](https://discussions.unity.com/u/kryzarel) ,

This is excellent. Thank you so much for sharing and for free. I really like the source Object idea. I was wondering though whether it might not be useful to have a new name string and a description string in the StatModifier(s)?

[![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/272373_2.png)](https://discussions.unity.com/u/Kryzarel)

[Kryzarel](https://discussions.unity.com/u/Kryzarel)

[Jan 2018](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458/16 "Post date")

[](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458/15 "go to the quoted post")

![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/48(3).png) Duffer123_1:

> [@Kryzarel](https://discussions.unity.com/u/kryzarel) ,
> 
> This is excellent. Thank you so much for sharing and for free. I really like the source Object idea. I was wondering though whether it might not be useful to have a new name string and a description string in the StatModifier(s)?

Just saw this now. Already answered in the video, so np ![:stuck_out_tongue:](HTML%20import/Attachments/stuck_out_tongue.png ":stuck_out_tongue:")

1

25 days later

[![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/84179_2.png)](https://discussions.unity.com/u/Kuuo)

[Kuuo](https://discussions.unity.com/u/Kuuo)

[Feb 2018](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458/17 "Post date")

[@Kryzarel](https://discussions.unity.com/u/kryzarel) Great tutorial! I learned a lot, thank you very much!

I’m currently working on a ‘stats system’ too, my idea is basically the same as yours, but I do found some problems:

1. StatType  
    I really don’t think it’s a good idea to use enum for StatTypes, because you never know when you want to add or remove types, it might be before you actually make your game, it might be in the progress of you making your game, and even some other day after you have published your game…  
    And also, different games need different collection of stat types.

here is my current solution:

`//Make the StatType as a ScriptableObject public class StatType : ScriptableObject {     public string typeName; // only a string of typeName here     // you can add this ID field if you want to     // public int typeId;  }`

And in the Stat and StatModifier class, they have a StatType field

`public class StatModifier {     public StatType targetType;     // etc... }`

`public class Stat : ScriptableObject {     public StatType type;     // etc...     // Make it return bool so you know whether the StatType is matched     public bool AddModifier(StatModifier newModifier)     {         if (newModifier.targetType != type) return false;         // do mod value things...         return true;     }     // also in Remove         public bool RemoveModifier(StatModifier modifierToRemove)     {         if (modifierToRemove.targetType != type) return false;         // etc...         return true;     } }`

And a StatTypeList class, manage all the StatTypes of the game.  
Since it’s an asset, you can have different set of stat types in your game

`public class StatTypeList : ScriptableObject {     public StatType[] data;  // just a collection of StatTypes here }`

And the CharacterStats class, a character may have many stats…

`// I used some new language features of C# 6 here public class CharacterStats : ScriptableObject {     public Stat[] stats; // I use array so it's more easy to write editor script     // use indexer to get matched type stat...      // I'm not sure it's good or not     // you might need HashSet or Dictionary to speed up the search     public Stat this[StatType type] => Array.Find(stats, s => s.type == type);     public bool AddModifier(StatModifier modifier) =>         this[modifier.targetType]?.AddModifier(modifier) ?? false;     public bool RemoveModifier(StatModifier modifier) =>         this[modifier.targetType]?.RemoveModifier(modifier) ?? false; }`

With Editor scripts, it’ll be more convenient to manage these assets in Editor,  
This is how the StatTypeList asset looks like in the project window:  
![3400033--267616--upload_2018-2-22_13-4-49.png](f3b6a37370af50ca1873eecc5603c3a0f4c2d03b.png)  
and in Inspector:  
![3400033--267617--upload_2018-2-22_13-7-54.png](a70fcb450700909937da3730e6572e462b3a10ce.png)

And the CharacterStats(collection of stats) asset:  
![3400033--267618--upload_2018-2-22_13-11-20.png](HTML%20import/Attachments/c23bb346c5c3b00cdff837baf0736252bcb2bc7b.png)  
(each stat here can be modified in inspector)

![3400033--267619--upload_2018-2-22_13-12-18.png](868644b5b430f6c3b2a9e3cdab28acb552bd0c8a.png)  
(the Name of ‘New Stat’ is just the asset name of it)

2. You may noticed that I make all of them, except StatModifier, as ScriptableObject, ScriptableObject helps a lot on the data persistent and UI binding things, but it also introduce some problems:

I’m wondering how to deal with the Enemy Stat…  
Each type of enemy (say goblin, slime, etc…) need a list of stats (if there are many types, the amount of assets will be huge, although we can make Editor scripts to create them automatically), and we can’t change the modifiers directly from their stats (because all the enemies of a same type uses the same stats asset), so we have to deal with it in the enemy’s MonoBehavoiur class…

And the items and equipments that modify stats…

Maybe just do not use ScriptableObject for CharacterStats?

4

[![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/272373_2.png)](https://discussions.unity.com/u/Kryzarel)

[Kryzarel](https://discussions.unity.com/u/Kryzarel)

[Feb 2018](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458/18 "Post date")

[@Kuuo](https://discussions.unity.com/u/kuuo) Your approach is very very interesting, you do bring up some excellent points! If I ever expand on this system I’ll definitely keep your post in mind.  
The reason for enums is because it’s the easiest thing to edit by anyone and also avoids string comparisons at run time (and typos), but your implementation solves that elegantly by using asset references instead, awesome ![:smile:](HTML%20import/Attachments/smile.png ":smile:")

As for the problem you presented, shouldn’t the stat list for each enemy be something that you define independently in each enemy prefab? Each enemy should have its own instance of the stat list. I might not be getting the entire picture just from your post, but that would seem like the more sane approach to take.

[![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/84179_2.png)](https://discussions.unity.com/u/Kuuo)

[Kuuo](https://discussions.unity.com/u/Kuuo)

[Feb 2018](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458/19 "Post date")

[@Kryzarel](https://discussions.unity.com/u/kryzarel) Thank you! I’m still thinking about how to solve that problem.

So now what in my mind is that

1. the stat assets only store the default stat of the character (both player and enemy)
2. the stat modifier should not be stored in the assets, but in the MonoBehavoiur script that each character attached, so that each character can just care about their own stats

As for using assets as enums, this idea is from these 2 awesome talks:

1. [Unite 2016 - Overthrowing the MonoBehaviour Tyranny in a Glorious Scriptable Object Revolution](https://www.youtube.com/watch?v=6vmRwLYWNRo)
2. [Unite Austin 2017 - Game Architecture with Scriptable Objects](https://www.youtube.com/watch?v=raQ3iHhE_Kk)

You should definitely check them out~;)

1

[![](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/272373_2.png)](https://discussions.unity.com/u/Kryzarel)

[Kryzarel](https://discussions.unity.com/u/Kryzarel)

[Feb 2018](https://discussions.unity.com/t/tutorial-character-stats-aka-attributes-system/682458/20 "Post date")

[@Kuuo](https://discussions.unity.com/u/kuuo) I had already seen those talks, but I kind of forgot a lot about them in the meantime. But now that you mention them I do start to remember. Definitely gonna have to watch them again sometime, they’re really interesting ![:smile:](HTML%20import/Attachments/smile.png ":smile:")

© 2024 Unity Technologies

- [Legal](https://unity.com/legal)
- [Privacy Policy](https://unity.com/legal/privacy-policy)
- [Cookies](https://unity.com/legal/cookie-policy)
- [Do Not Sell or Share My Personal Information](https://unity.com/legal/do-not-sell-my-personal-information)
- [Your Privacy Choices (Cookie Settings)](javascript:void(0);)

"Unity", Unity logos, and other Unity trademarks are trademarks or registered trademarks of Unity Technologies or its affiliates in the U.S. and elsewhere ([more info here](https://unity.com/legal/trademarks)). Other names or brands are trademarks of their respective owners.

Invalid date Invalid date

   

By clicking “Accept Cookies”, you agree to the storing of cookies on your device to enhance site navigation, analyze site usage, and assist in our marketing efforts.

Cookie Settings Reject All Accept All Cookies

![Company Logo](./[Tutorial]%20Character%20Stats%20(aka%20Attributes)%20System%20-%20Learn%20Content%20-%20Unity%20Discussions_files/unity-logo.png)

## Privacy Preference Center

Your Opt Out Preference Signal is Honored

- ### Your Privacy
    
- ### Functional Cookies
    
- ### Performance Cookies
    
- ### Targeting Cookies
    
- ### Strictly Necessary Cookies
    

#### Your Privacy

When you visit any website, it may store or retrieve information on your browser, mostly in the form of cookies. This information might be about you, your preferences or your device and is mostly used to make the site work as you expect it to. The information does not usually directly identify you, but it can give you a more personalized web experience. Because we respect your right to privacy, you can choose not to allow some types of cookies. Click on the different category headings to find out more and change our default settings. However, blocking some types of cookies may impact your experience of the site and the services we are able to offer.  
[More information](https://unity.com/legal/cookie-policy)

#### Functional Cookies

 Functional Cookies Active

These cookies enable the website to provide enhanced functionality and personalisation. They may be set by us or by third party providers whose services we have added to our pages. If you do not allow these cookies then some or all of these services may not function properly.

Cookies Details‎

#### Performance Cookies

 Performance Cookies Active

These cookies allow us to count visits and traffic sources so we can measure and improve the performance of our site. They help us to know which pages are the most and least popular and see how visitors move around the site. All information these cookies collect is aggregated and therefore anonymous. If you do not allow these cookies we will not know when you have visited our site, and will not be able to monitor its performance.

Cookies Details‎

#### Targeting Cookies

 Targeting Cookies Active

These cookies may be set through our site by our advertising partners. They may be used by those companies to build a profile of your interests and show you relevant adverts on other sites. They do not store directly personal information, but are based on uniquely identifying your browser and internet device. If you do not allow these cookies, you will experience less targeted advertising. Some 3rd party video providers do not allow video views without targeting cookies. If you are experiencing difficulty viewing a video, you will need to set your cookie preferences for targeting to yes if you wish to view videos from these providers. Unity does not control this.

Cookies Details‎

#### Strictly Necessary Cookies

Always Active

These cookies are necessary for the website to function and cannot be switched off in our systems. They are usually only set in response to actions made by you which amount to a request for services, such as setting your privacy preferences, logging in or filling in forms. You can set your browser to block or alert you about these cookies, but some parts of the site will not then work. These cookies do not store any personally identifiable information.

Cookies Details‎

### Cookie List

Consent Leg.Interest

 checkbox label label

 checkbox label label

 checkbox label label

Clear

 checkbox label label

Apply Cancel

Confirm my choices

Reject all Allow all

[![Powered by Onetrust](HTML%20import/Attachments/powered_by_logo.svg "Powered by OneTrust Opens in a new Tab")](https://www.onetrust.com/products/cookie-consent/)