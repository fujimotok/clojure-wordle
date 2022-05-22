(ns clojure-wordle.words
  (:gen-class))

(def words [
"aaron"
"aback"
"abate"
"abbey"
"abbot"
"abdul"
"abhor"
"abide"
"abort"
"about"
"above"
"abuse"
"abuzz"
"abyss"
"acorn"
"acrid"
"actin"
"actor"
"acute"
"adage"
"adapt"
"added"
"adder"
"adept"
"adieu"
"adman"
"admin"
"admit"
"adobe"
"adolf"
"adopt"
"adore"
"adorn"
"adult"
"aegis"
"aerie"
"aesop"
"aetna"
"afaik"
"affix"
"afire"
"afoot"
"afoul"
"after"
"again"
"agape"
"agate"
"agave"
"agent"
"agile"
"aging"
"aglow"
"agony"
"agora"
"agree"
"ahead"
"ahmed"
"aicpa"
"aimee"
"aires"
"aisle"
"akbar"
"alamo"
"alarm"
"album"
"alcoa"
"alder"
"alert"
"algae"
"algal"
"alger"
"alias"
"alibi"
"alice"
"alien"
"align"
"alike"
"alive"
"allay"
"allen"
"alley"
"allot"
"allow"
"alloy"
"aloft"
"aloha"
"alone"
"along"
"aloof"
"aloud"
"alpha"
"altar"
"alter"
"amass"
"amaze"
"amber"
"ambit"
"amble"
"amend"
"amgen"
"amino"
"amish"
"amiss"
"amity"
"amman"
"among"
"amour"
"ample"
"amply"
"amuse"
"amway"
"andre"
"angel"
"anger"
"angle"
"anglo"
"angry"
"angst"
"angus"
"anima"
"anime"
"anion"
"anise"
"anita"
"ankle"
"annan"
"annex"
"annie"
"annoy"
"annul"
"anova"
"antic"
"antsy"
"anvil"
"aorta"
"apace"
"apart"
"aphid"
"apple"
"apply"
"april"
"apron"
"aptly"
"arbor"
"ardor"
"arena"
"argon"
"argot"
"argue"
"argus"
"arise"
"armed"
"armor"
"aroma"
"arras"
"array"
"arrow"
"arson"
"aryan"
"ascus"
"ashen"
"asian"
"aside"
"asked"
"askew"
"aspen"
"assay"
"asset"
"aster"
"astor"
"astro"
"aswan"
"atapi"
"atlas"
"atoll"
"atone"
"attic"
"audio"
"audit"
"augur"
"aural"
"auxin"
"avail"
"avert"
"avian"
"avoid"
"await"
"awake"
"award"
"aware"
"awash"
"awful"
"axial"
"axiom"
"aztec"
"azure"
"babel"
"bacon"
"badge"
"badly"
"bagel"
"baggy"
"bairn"
"baked"
"baker"
"balky"
"bally"
"balmy"
"bambi"
"banal"
"bandy"
"banjo"
"barak"
"barge"
"baron"
"basal"
"basel"
"basic"
"basil"
"basin"
"basis"
"batch"
"bathe"
"baths"
"batik"
"baton"
"batty"
"bawdy"
"bayer"
"bayou"
"beach"
"beady"
"beard"
"beary"
"beast"
"beaut"
"bebop"
"beech"
"beefy"
"beery"
"befit"
"beget"
"begin"
"beige"
"being"
"belay"
"belch"
"belie"
"belle"
"belly"
"below"
"bench"
"benin"
"beret"
"berry"
"berth"
"beset"
"betsy"
"betty"
"beyer"
"bible"
"bidet"
"bight"
"bigot"
"biker"
"bilge"
"billy"
"bimbo"
"binge"
"bingo"
"birch"
"birth"
"bison"
"bitch"
"bitty"
"bizet"
"black"
"blade"
"blair"
"blame"
"blanc"
"bland"
"blank"
"blare"
"blase"
"blast"
"blaze"
"bleah"
"bleak"
"bleat"
"bleed"
"bleep"
"blend"
"bless"
"blimp"
"blind"
"blink"
"bliss"
"blitz"
"bloat"
"block"
"bloke"
"blond"
"blood"
"bloom"
"blown"
"blues"
"bluff"
"blunt"
"blurb"
"blurt"
"blush"
"board"
"boast"
"bobby"
"bogey"
"boggy"
"bogie"
"bogle"
"bogus"
"bolus"
"bongo"
"bonny"
"bonus"
"booby"
"books"
"boone"
"boost"
"booth"
"booty"
"booze"
"boozy"
"bored"
"borer"
"bosom"
"bossy"
"botch"
"botox"
"bough"
"bound"
"bowel"
"bower"
"boxed"
"boxer"
"brace"
"brady"
"braid"
"brain"
"brake"
"brand"
"brash"
"brass"
"brave"
"bravo"
"brawl"
"bread"
"break"
"bream"
"breed"
"brent"
"brian"
"briar"
"bribe"
"brick"
"bride"
"brief"
"brigg"
"brill"
"brine"
"bring"
"brink"
"briny"
"brisk"
"broad"
"brock"
"broil"
"broke"
"bronx"
"brood"
"brook"
"broom"
"broth"
"brown"
"bruce"
"bruin"
"brunt"
"brush"
"brute"
"bucko"
"buddy"
"budge"
"bueno"
"buffy"
"buggy"
"bugle"
"buick"
"build"
"bulge"
"bulky"
"bully"
"bumpy"
"bunch"
"bunny"
"burke"
"burly"
"burma"
"burnt"
"burro"
"bursa"
"burst"
"busch"
"bushy"
"busty"
"butch"
"butte"
"buxom"
"buyer"
"bylaw"
"byway"
"cabal"
"cabby"
"cabin"
"cable"
"cacao"
"cache"
"caddy"
"cadet"
"cadre"
"caged"
"cagey"
"cairn"
"cairo"
"cajun"
"calif"
"calla"
"calle"
"calyx"
"camel"
"cameo"
"camii"
"campy"
"canal"
"candy"
"canna"
"canny"
"canoe"
"canon"
"canto"
"caper"
"caput"
"carat"
"carey"
"cargo"
"carib"
"carol"
"carry"
"carte"
"carve"
"caste"
"catch"
"cater"
"catty"
"caulk"
"cause"
"cavil"
"cease"
"cedar"
"celeb"
"cello"
"cfeom"
"chafe"
"chaff"
"chaga"
"chain"
"chair"
"chalk"
"champ"
"chang"
"chant"
"chaos"
"chard"
"charm"
"chart"
"chase"
"chasm"
"chaus"
"cheap"
"cheat"
"check"
"cheek"
"cheep"
"cheer"
"chess"
"chest"
"chevy"
"chewy"
"chick"
"chide"
"chief"
"child"
"chile"
"chili"
"chill"
"chime"
"chimp"
"china"
"chink"
"chino"
"chirp"
"chive"
"chock"
"choir"
"choke"
"cholo"
"chomp"
"chord"
"chore"
"chris"
"chrna"
"chuck"
"chump"
"chunk"
"churn"
"chute"
"cider"
"cigar"
"cinch"
"cinco"
"cindy"
"circa"
"cisco"
"cites"
"civet"
"civic"
"civil"
"clack"
"claim"
"clamp"
"clang"
"clank"
"clara"
"clark"
"clash"
"clasp"
"class"
"claus"
"clean"
"clear"
"cleat"
"cleft"
"clerk"
"click"
"cliff"
"climb"
"clime"
"cline"
"cling"
"clink"
"cloak"
"clock"
"clone"
"close"
"cloth"
"cloud"
"clout"
"clove"
"clown"
"cluck"
"clued"
"clump"
"clunk"
"cnnfn"
"coach"
"coast"
"cobra"
"cocky"
"cocoa"
"coded"
"coder"
"codex"
"codon"
"cohen"
"colic"
"colin"
"colon"
"color"
"combo"
"comer"
"comet"
"comfy"
"comic"
"comin"
"comma"
"conch"
"condo"
"conga"
"congo"
"conte"
"copse"
"coral"
"cordy"
"corny"
"corps"
"corso"
"corus"
"costa"
"couch"
"cough"
"could"
"count"
"coupe"
"court"
"coven"
"cover"
"covet"
"covey"
"cowed"
"cower"
"coyly"
"crack"
"craft"
"craig"
"cramp"
"crane"
"crank"
"crape"
"crash"
"crass"
"crate"
"crave"
"crawl"
"craze"
"crazy"
"creak"
"cream"
"credo"
"creed"
"creek"
"creel"
"creep"
"crepe"
"crest"
"crete"
"crick"
"cried"
"crier"
"crime"
"crimp"
"crisp"
"croak"
"croat"
"crock"
"crohn"
"crone"
"crony"
"crook"
"croon"
"cross"
"croup"
"crowd"
"crown"
"crude"
"cruel"
"crumb"
"cruse"
"crush"
"crust"
"crypt"
"cuban"
"cubic"
"cumin"
"cupid"
"curie"
"curio"
"curly"
"curry"
"curse"
"curve"
"curvy"
"cushy"
"cuter"
"cutie"
"cyber"
"cycle"
"cynic"
"czech"
"daddy"
"daffy"
"daily"
"dairy"
"daisy"
"dally"
"damme"
"damon"
"dance"
"dandy"
"danny"
"dante"
"daunt"
"davis"
"davit"
"dazed"
"death"
"debby"
"debit"
"debra"
"debug"
"debut"
"decaf"
"decal"
"decay"
"decor"
"decoy"
"decry"
"defer"
"deign"
"deism"
"deity"
"delay"
"delft"
"delhi"
"della"
"delta"
"delve"
"demon"
"demur"
"deneb"
"denim"
"dense"
"depot"
"depth"
"deter"
"detox"
"deuce"
"devil"
"diana"
"diane"
"diary"
"diced"
"dicer"
"dicey"
"diego"
"digit"
"dimer"
"dimly"
"dinar"
"diner"
"dingo"
"dingy"
"dinky"
"diode"
"dirge"
"dirty"
"disco"
"dishy"
"ditch"
"ditto"
"ditty"
"divan"
"diver"
"divvy"
"dixie"
"dizzy"
"dnase"
"dodge"
"dodgy"
"doesn"
"doggy"
"dogma"
"doily"
"doing"
"dolly"
"dolor"
"domed"
"donna"
"donor"
"donut"
"dopey"
"doric"
"doris"
"dorky"
"dotty"
"doubt"
"dough"
"douse"
"dover"
"dowdy"
"dowel"
"downy"
"dowry"
"doyle"
"dozen"
"draco"
"draft"
"drain"
"drake"
"drama"
"drank"
"drape"
"drawl"
"drawn"
"dread"
"dream"
"dreck"
"dregs"
"dress"
"dried"
"drier"
"drift"
"drill"
"drink"
"drive"
"droll"
"drone"
"drool"
"droop"
"dross"
"drove"
"drown"
"drugs"
"druid"
"drunk"
"dryer"
"dryly"
"dsdna"
"dsrna"
"dubai"
"dubia"
"duchy"
"ducky"
"dully"
"dumbo"
"dummy"
"dumpy"
"dunce"
"dunno"
"duomo"
"duped"
"dusky"
"dusty"
"dutch"
"dwarf"
"dweeb"
"dwell"
"dwelt"
"dying"
"eager"
"eagle"
"early"
"earth"
"easel"
"eater"
"eaves"
"ebert"
"ebola"
"ebony"
"eddie"
"edema"
"edgar"
"edict"
"edify"
"eerie"
"egret"
"egypt"
"eider"
"eight"
"eisen"
"eject"
"elbow"
"elder"
"elect"
"elegy"
"elena"
"elfin"
"elide"
"elisa"
"elite"
"elium"
"ellen"
"elope"
"elude"
"elute"
"elviｓ"
"email"
"embed"
"ember"
"emcee"
"emery"
"emily"
"emote"
"empty"
"enact"
"ended"
"endit"
"endow"
"enema"
"enemy"
"enjoy"
"ennui"
"enron"
"ensue"
"enter"
"entry"
"envoy"
"epoch"
"epoxy"
"equal"
"equip"
"erase"
"erect"
"erisa"
"erode"
"error"
"erupt"
"essay"
"essex"
"ester"
"ethan"
"ethel"
"ether"
"ethic"
"ethos"
"ethyl"
"evade"
"event"
"evert"
"every"
"evict"
"evoke"
"exact"
"exalt"
"excel"
"exert"
"exile"
"exist"
"expat"
"expel"
"extol"
"extra"
"exude"
"exult"
"exuma"
"exxon"
"fable"
"facet"
"facto"
"faint"
"faire"
"fairy"
"faith"
"faker"
"false"
"famed"
"famer"
"fancy"
"fanny"
"farce"
"fasab"
"fatah"
"fatal"
"fatty"
"fatwa"
"fault"
"fauna"
"favor"
"feast"
"fecal"
"fedex"
"feign"
"feint"
"felix"
"fella"
"felon"
"femme"
"femur"
"fence"
"feral"
"ferry"
"fetal"
"fetch"
"fetid"
"fetus"
"fever"
"fewer"
"fiber"
"fibre"
"field"
"fiend"
"fiery"
"fifth"
"fifty"
"fight"
"filch"
"filed"
"filet"
"filly"
"filth"
"final"
"finch"
"finer"
"fired"
"first"
"firth"
"fishy"
"fitch"
"fiver"
"fives"
"fixed"
"fixer"
"fizzy"
"fjord"
"flack"
"flail"
"flair"
"flake"
"flaky"
"flame"
"flank"
"flare"
"flash"
"flask"
"fleck"
"fleet"
"flesh"
"flick"
"flier"
"fling"
"flint"
"flirt"
"float"
"flock"
"flood"
"floor"
"flora"
"floss"
"flour"
"flout"
"floyd"
"fluff"
"fluid"
"fluke"
"flung"
"flunk"
"flush"
"flute"
"flyer"
"fmrus"
"foamy"
"focal"
"focus"
"foggy"
"foist"
"folio"
"folks"
"folky"
"folly"
"foray"
"forbs"
"force"
"forge"
"forgo"
"forte"
"forth"
"forty"
"forum"
"fosse"
"found"
"fount"
"fours"
"foyer"
"frack"
"frail"
"frame"
"franc"
"frank"
"fraud"
"freak"
"freer"
"freon"
"fresh"
"freud"
"friar"
"fried"
"frill"
"frisk"
"frock"
"frond"
"front"
"frost"
"froth"
"frown"
"fruit"
"fryer"
"fudge"
"fugue"
"fully"
"fumes"
"funky"
"funny"
"furby"
"furor"
"furry"
"fused"
"fussy"
"fusty"
"fuzzy"
"gable"
"gaffe"
"gaily"
"gaine"
"games"
"gamma"
"gamut"
"garbo"
"gated"
"gator"
"gaudy"
"gauge"
"gaunt"
"gauze"
"gauzy"
"gavel"
"gazed"
"gecko"
"geeky"
"gelid"
"genie"
"genoa"
"genre"
"genus"
"ghana"
"ghost"
"giant"
"gibco"
"giddy"
"giles"
"girly"
"girth"
"given"
"giver"
"glace"
"glade"
"gland"
"glare"
"glass"
"glaze"
"gleam"
"glean"
"glenn"
"glide"
"glint"
"glitz"
"gloat"
"globe"
"gloom"
"glory"
"gloss"
"glove"
"gnash"
"gnome"
"godly"
"going"
"golly"
"goner"
"gonna"
"goods"
"goody"
"gooey"
"goofy"
"goose"
"gorge"
"gorse"
"gotta"
"gouge"
"gourd"
"grace"
"grade"
"graft"
"grail"
"grain"
"gramm"
"gramp"
"grand"
"grant"
"grape"
"graph"
"grasp"
"grass"
"grate"
"grave"
"gravy"
"graze"
"great"
"greed"
"greek"
"green"
"greet"
"grief"
"grill"
"grime"
"grimm"
"grimy"
"grind"
"gripe"
"grist"
"grits"
"groan"
"groat"
"groin"
"groom"
"grope"
"gross"
"group"
"grove"
"growl"
"grown"
"gruel"
"gruff"
"grump"
"grunt"
"guano"
"guard"
"guava"
"guess"
"guest"
"guide"
"guild"
"guile"
"guilt"
"guise"
"gulag"
"gulch"
"gully"
"gumbo"
"gummy"
"gupta"
"gurus"
"gushy"
"gusto"
"gusty"
"gutsy"
"gypsy"
"habit"
"haccp"
"hague"
"haifa"
"haiku"
"hairy"
"haiti"
"hakim"
"halle"
"hallo"
"halve"
"hamas"
"handy"
"hanky"
"happy"
"hardy"
"harem"
"harpy"
"harry"
"harsh"
"haste"
"hasty"
"hatch"
"hated"
"hater"
"haunt"
"haute"
"haven"
"haver"
"haves"
"havoc"
"haydn"
"hazel"
"heady"
"heart"
"heath"
"heave"
"heavy"
"hedge"
"hefty"
"heidi"
"heinz"
"heist"
"helen"
"helix"
"hella"
"hello"
"hence"
"henna"
"henry"
"herod"
"heron"
"hertz"
"hiker"
"hilly"
"hindi"
"hindu"
"hinge"
"hippo"
"hippy"
"histo"
"hitch"
"hoard"
"hoary"
"hobby"
"hocus"
"hogan"
"hoist"
"hokey"
"hokum"
"holly"
"holtz"
"homer"
"homey"
"homme"
"honda"
"honey"
"honor"
"hooch"
"hooky"
"horde"
"horny"
"horse"
"hotel"
"hotly"
"hough"
"hound"
"house"
"hovel"
"hover"
"howdy"
"hoyay"
"hubby"
"huffy"
"hullo"
"human"
"humid"
"humor"
"humph"
"humus"
"hunch"
"hunky"
"hurry"
"husky"
"hussy"
"hutch"
"hwang"
"hyatt"
"hydra"
"hydro"
"hyena"
"hyper"
"icily"
"idaho"
"ideal"
"idiom"
"idiot"
"idler"
"idyll"
"iggsd"
"igloo"
"ileal"
"ileum"
"image"
"imago"
"imbue"
"impel"
"imply"
"inane"
"inbox"
"incur"
"index"
"india"
"indie"
"inept"
"inert"
"infer"
"inlay"
"inlet"
"inner"
"input"
"inset"
"intel"
"inter"
"intra"
"intro"
"inure"
"ionic"
"iraqi"
"irate"
"irene"
"irish"
"irony"
"isaac"
"islam"
"islet"
"issue"
"italy"
"itchy"
"itune"
"ivory"
"jacob"
"jaded"
"jakob"
"james"
"jamie"
"jammy"
"janet"
"janus"
"japan"
"jason"
"jaunt"
"jazzy"
"jeans"
"jello"
"jelly"
"jemmy"
"jenny"
"jerky"
"jerry"
"jesse"
"jesus"
"jetty"
"jewel"
"jiang"
"jiffy"
"jihad"
"jilli"
"jimmy"
"jingo"
"johor"
"joint"
"joist"
"joker"
"jokey"
"jolly"
"jones"
"joule"
"joust"
"jowly"
"joyce"
"judah"
"judge"
"juice"
"juicy"
"julie"
"jumbo"
"jumpy"
"junta"
"juror"
"kabul"
"kappa"
"kaput"
"karen"
"karma"
"katha"
"kathy"
"kayak"
"kebab"
"keith"
"kelly"
"kenny"
"kenya"
"kerry"
"ketch"
"kevin"
"keyed"
"khaki"
"khmer"
"kicky"
"kinda"
"kinko"
"kinky"
"kiosk"
"kitty"
"klein"
"klutz"
"kmart"
"knack"
"knave"
"knead"
"kneel"
"knell"
"knelt"
"knick"
"knife"
"knock"
"knoll"
"koala"
"kodak"
"kooky"
"koran"
"korea"
"kraft"
"kraut"
"krill"
"krone"
"kuala"
"kudos"
"label"
"labor"
"laden"
"ladin"
"ladle"
"lager"
"laird"
"laity"
"lance"
"lanka"
"lanky"
"lapel"
"lapin"
"lapse"
"large"
"largo"
"larry"
"larva"
"laser"
"lassa"
"lasso"
"latch"
"later"
"latex"
"lathe"
"latin"
"laugh"
"laura"
"laver"
"layer"
"leach"
"leads"
"leafy"
"leaky"
"learn"
"lease"
"leash"
"least"
"leave"
"leche"
"ledge"
"leech"
"leery"
"lefty"
"legal"
"leger"
"leggy"
"leica"
"leigh"
"leith"
"lemma"
"lemon"
"lemur"
"leper"
"lethe"
"levee"
"level"
"lever"
"lewis"
"libel"
"libra"
"libya"
"liege"
"light"
"liken"
"likes"
"likud"
"lilac"
"lilah"
"lilly"
"limbo"
"limey"
"limit"
"linda"
"linen"
"liner"
"lingo"
"linux"
"lipid"
"lippo"
"liszt"
"liter"
"lithe"
"litre"
"liven"
"liver"
"lives"
"livid"
"llama"
"llano"
"lloyd"
"lncap"
"loach"
"loath"
"lobby"
"local"
"locus"
"lodge"
"lofty"
"logic"
"loire"
"lolly"
"lomax"
"loner"
"loony"
"loopy"
"loose"
"lopez"
"loran"
"lordy"
"lorry"
"lorus"
"loser"
"lotsa"
"lotta"
"lotto"
"lotus"
"louse"
"lousy"
"loved"
"lover"
"lower"
"lowly"
"loyal"
"lucid"
"lucky"
"lucre"
"lukas"
"lumen"
"lumpy"
"lunar"
"lunch"
"lunge"
"lupus"
"lurch"
"lurid"
"lusty"
"lutea"
"luxor"
"lying"
"lymph"
"lynch"
"lyric"
"lysed"
"lysis"
"lytic"
"macau"
"macaw"
"macho"
"macro"
"madam"
"madly"
"madre"
"mafia"
"magic"
"magma"
"maine"
"maize"
"major"
"maker"
"malay"
"malta"
"malus"
"mambo"
"mamma"
"mammy"
"mange"
"mango"
"mangy"
"mania"
"manic"
"manly"
"manna"
"manor"
"manse"
"manta"
"maple"
"march"
"marco"
"marge"
"maria"
"marie"
"marin"
"mario"
"marry"
"marsh"
"mason"
"match"
"mater"
"matey"
"matte"
"matzo"
"mauve"
"maven"
"maxed"
"maxim"
"mayan"
"maybe"
"mayer"
"mayor"
"mazda"
"mazel"
"mealy"
"means"
"meant"
"meaty"
"mecca"
"mecha"
"medal"
"media"
"medic"
"mekon"
"melan"
"melee"
"melon"
"menus"
"mercy"
"merge"
"merit"
"merle"
"merry"
"meson"
"messy"
"metal"
"meter"
"metre"
"metro"
"mglur"
"miami"
"micro"
"midge"
"midst"
"might"
"milan"
"milky"
"mimic"
"mimus"
"mince"
"mined"
"miner"
"minor"
"minus"
"mirna"
"mirth"
"miser"
"missy"
"misty"
"miter"
"mixed"
"mixer"
"mobil"
"mocha"
"modal"
"model"
"modem"
"modus"
"mogul"
"moist"
"molar"
"moldy"
"molly"
"momma"
"mommy"
"monde"
"monet"
"money"
"monte"
"month"
"mooch"
"moody"
"moore"
"moose"
"moped"
"moral"
"moray"
"mores"
"moron"
"morph"
"morse"
"morus"
"moses"
"mossy"
"motel"
"motif"
"motor"
"motto"
"mould"
"mound"
"mount"
"mourn"
"mouse"
"mousy"
"mouth"
"moved"
"mover"
"movie"
"mowed"
"mower"
"moxie"
"mtdna"
"mucho"
"mucus"
"muddy"
"muggy"
"mulch"
"multi"
"mummy"
"mumps"
"munch"
"mural"
"murky"
"mused"
"museo"
"mushy"
"music"
"musky"
"musty"
"muted"
"myrrh"
"mysid"
"mysql"
"naacp"
"nacho"
"nachr"
"nader"
"nadir"
"nafta"
"nahco"
"naive"
"naked"
"names"
"nancy"
"nanny"
"nappy"
"nasal"
"nasty"
"natal"
"natch"
"natty"
"naval"
"navel"
"needs"
"needy"
"negro"
"nehru"
"neigh"
"neill"
"nelly"
"nepal"
"nerdy"
"nerve"
"nervy"
"never"
"nevis"
"nevus"
"newer"
"newly"
"newsy"
"nexus"
"nicer"
"niche"
"niece"
"nifty"
"niger"
"night"
"nikon"
"nilly"
"ninja"
"ninny"
"ninth"
"nippy"
"nixon"
"nobel"
"noble"
"nobly"
"nodal"
"noise"
"noisy"
"nomad"
"nonce"
"noone"
"noose"
"norad"
"norse"
"north"
"nosed"
"notch"
"noted"
"notre"
"novel"
"nudge"
"nurse"
"nutty"
"nylon"
"nymph"
"oasis"
"obama"
"obese"
"occur"
"ocean"
"ocher"
"ochre"
"oddly"
"odour"
"offal"
"offer"
"often"
"ogden"
"oiler"
"olden"
"older"
"oligo"
"olive"
"ollie"
"omaha"
"omega"
"onion"
"onset"
"oomph"
"opera"
"opine"
"opium"
"optic"
"orang"
"orate"
"orbit"
"order"
"organ"
"orion"
"osaka"
"oscar"
"oskar"
"osman"
"other"
"otter"
"ought"
"ounce"
"outdo"
"outer"
"outre"
"outta"
"ovary"
"overt"
"ovoid"
"owing"
"owner"
"oxide"
"ozone"
"pablo"
"pacer"
"paddy"
"padre"
"paean"
"pagan"
"pager"
"paint"
"palau"
"palma"
"palsy"
"pampa"
"panda"
"panel"
"panga"
"panic"
"pansy"
"pants"
"panty"
"papal"
"paper"
"pappy"
"papua"
"parch"
"paris"
"parka"
"parry"
"parse"
"party"
"paseo"
"pasha"
"passe"
"pasta"
"paste"
"pasty"
"patch"
"pater"
"patio"
"patsy"
"patty"
"paula"
"paulo"
"pause"
"paved"
"payee"
"payer"
"peace"
"peach"
"pearl"
"pecan"
"pedal"
"pedro"
"peeve"
"penal"
"penis"
"penny"
"peony"
"peppy"
"pepsi"
"perch"
"perez"
"peril"
"perky"
"perry"
"pesky"
"petal"
"peter"
"petit"
"petra"
"petro"
"petty"
"phage"
"phase"
"phlox"
"phone"
"phony"
"photo"
"piano"
"picky"
"piece"
"piety"
"piggy"
"piker"
"pilot"
"pinch"
"piney"
"pinko"
"pinna"
"pinta"
"pinto"
"pinup"
"pious"
"piper"
"pique"
"pissy"
"pisum"
"pitch"
"pithy"
"pitre"
"pivot"
"pixar"
"pixel"
"pixie"
"pizza"
"place"
"plaid"
"plain"
"plait"
"plane"
"plank"
"plano"
"plant"
"plate"
"plato"
"playa"
"plaza"
"plead"
"pleat"
"plink"
"plonk"
"plotz"
"pluck"
"plumb"
"plume"
"plump"
"plunk"
"plush"
"pluto"
"poach"
"point"
"poise"
"poker"
"pokey"
"polar"
"polio"
"polka"
"polyp"
"pombe"
"ponce"
"pooch"
"poppa"
"poppy"
"porch"
"porgy"
"porno"
"porny"
"porto"
"poser"
"posit"
"posse"
"potty"
"potus"
"pouch"
"pound"
"pouty"
"power"
"prada"
"prank"
"prawn"
"preen"
"press"
"price"
"prick"
"pride"
"prima"
"prime"
"primo"
"primp"
"print"
"prion"
"prior"
"prism"
"privy"
"prize"
"probe"
"prole"
"promo"
"prone"
"prong"
"proof"
"prose"
"proto"
"proud"
"prove"
"provo"
"prowl"
"proxy"
"prude"
"prune"
"psalm"
"pshaw"
"psych"
"pthrp"
"pubic"
"pubis"
"pudgy"
"puffy"
"pulpy"
"pulse"
"punch"
"pupal"
"pupil"
"puppy"
"puree"
"purge"
"purse"
"pushy"
"pussy"
"putin"
"putty"
"pygmy"
"pylon"
"qaeda"
"qaida"
"qatar"
"quack"
"quail"
"quake"
"qualm"
"quark"
"quart"
"quash"
"quasi"
"queen"
"queer"
"quell"
"query"
"quest"
"queue"
"quick"
"quiet"
"quill"
"quilt"
"quinn"
"quirk"
"quite"
"quota"
"quote"
"quoth"
"quran"
"qwest"
"rabbi"
"rabid"
"racer"
"races"
"radar"
"radio"
"radon"
"rainy"
"raise"
"rajah"
"rally"
"ralph"
"ramus"
"ranch"
"randy"
"range"
"rangy"
"rapid"
"rarer"
"rater"
"ratio"
"ratty"
"ravel"
"raven"
"raver"
"rayon"
"razor"
"reach"
"react"
"ready"
"realm"
"rearm"
"rebel"
"rebus"
"rebut"
"recap"
"recur"
"redox"
"redux"
"reedy"
"reeve"
"refer"
"regal"
"rehab"
"reign"
"relax"
"relay"
"relic"
"remit"
"remix"
"renal"
"renew"
"repay"
"repel"
"reply"
"rerun"
"reset"
"resin"
"retch"
"retro"
"retry"
"reuse"
"revel"
"revue"
"rhine"
"rhino"
"rhode"
"rhone"
"rhyme"
"rican"
"rider"
"ridge"
"rifle"
"rigel"
"right"
"rigid"
"rigor"
"riley"
"rings"
"rinse"
"ripen"
"risch"
"risen"
"riser"
"risky"
"ritzy"
"rival"
"riven"
"river"
"rivet"
"riyal"
"rnase"
"roach"
"roast"
"robby"
"robed"
"robin"
"robot"
"roche"
"rocky"
"rodeo"
"rodin"
"roger"
"rogue"
"rolex"
"roman"
"romeo"
"roomy"
"roost"
"roped"
"rosin"
"rotor"
"rouen"
"rouge"
"rough"
"round"
"rouse"
"route"
"rover"
"rowan"
"rowdy"
"rower"
"royal"
"royce"
"rubin"
"ruble"
"ruddy"
"rugby"
"ruler"
"rumba"
"rummy"
"rumor"
"runny"
"rupee"
"rural"
"rusty"
"sabah"
"saber"
"sable"
"sabre"
"sacre"
"sadly"
"safer"
"saggy"
"sahib"
"saint"
"salad"
"sales"
"salle"
"sally"
"salon"
"salsa"
"salty"
"salve"
"salvo"
"samba"
"sambo"
"sammy"
"samoa"
"sandy"
"santa"
"sappy"
"sarah"
"saran"
"sarin"
"sassy"
"satan"
"satin"
"satyr"
"sauce"
"saucy"
"saudi"
"sauna"
"saute"
"saved"
"saver"
"savor"
"savoy"
"savvy"
"saxon"
"scads"
"scald"
"scale"
"scalp"
"scaly"
"scamp"
"scant"
"scare"
"scarf"
"scary"
"scene"
"scent"
"scion"
"scoff"
"scold"
"scone"
"scoop"
"scoot"
"scope"
"score"
"scorn"
"scott"
"scour"
"scout"
"scowl"
"scrap"
"scree"
"screw"
"scrip"
"scrub"
"scrum"
"scuba"
"scuff"
"scull"
"seamy"
"sedan"
"seedy"
"seems"
"segue"
"seine"
"seize"
"semen"
"senor"
"sense"
"seoul"
"sepal"
"sepia"
"sepoy"
"serge"
"serum"
"serve"
"setup"
"seven"
"sever"
"sewed"
"sewer"
"shack"
"shade"
"shady"
"shaft"
"shake"
"shaky"
"shale"
"shall"
"shalt"
"shame"
"shank"
"shape"
"shard"
"share"
"shark"
"sharp"
"shave"
"shawl"
"shawn"
"sheaf"
"shear"
"sheen"
"sheep"
"sheer"
"sheet"
"sheik"
"shelf"
"shell"
"shift"
"shill"
"shine"
"shiny"
"shire"
"shirk"
"shirt"
"shiva"
"shoal"
"shock"
"shoot"
"shore"
"shorn"
"short"
"shout"
"shove"
"shown"
"showy"
"shred"
"shrew"
"shrub"
"shrug"
"shuck"
"shunt"
"shush"
"shyly"
"sidle"
"siege"
"siena"
"sieve"
"sight"
"sigma"
"silky"
"silly"
"simon"
"sinai"
"since"
"sinew"
"sinus"
"sired"
"siren"
"sirna"
"sisal"
"sissy"
"sitar"
"sixth"
"sixty"
"skate"
"skein"
"skied"
"skier"
"skill"
"skimp"
"skirt"
"skulk"
"skull"
"skunk"
"slack"
"slake"
"slang"
"slant"
"slash"
"slate"
"slave"
"sleek"
"sleep"
"sleet"
"slice"
"slick"
"slide"
"slime"
"slimy"
"sling"
"slink"
"slope"
"slosh"
"sloth"
"slump"
"slung"
"slurp"
"slush"
"slyly"
"smack"
"small"
"smart"
"smash"
"smear"
"smell"
"smelt"
"smile"
"smirk"
"smite"
"smith"
"smock"
"smoke"
"smoky"
"snack"
"snafu"
"snail"
"snake"
"snare"
"snarl"
"sneak"
"sneer"
"snell"
"snerk"
"snide"
"sniff"
"snipe"
"snoop"
"snope"
"snore"
"snort"
"snout"
"snowy"
"snrna"
"snuck"
"snuff"
"soapy"
"sober"
"socal"
"socks"
"sodom"
"sofia"
"softy"
"soggy"
"solar"
"solid"
"solve"
"sonar"
"sonic"
"sonny"
"sooth"
"sooty"
"sorry"
"sorta"
"sound"
"soupy"
"south"
"soyuz"
"space"
"spade"
"spain"
"spank"
"sparc"
"spare"
"spark"
"spasm"
"spate"
"spawn"
"speak"
"spear"
"speck"
"speed"
"spell"
"spelt"
"spend"
"spent"
"sperm"
"spice"
"spicy"
"spiel"
"spiff"
"spike"
"spiky"
"spill"
"spilt"
"spine"
"spiny"
"spire"
"spite"
"splat"
"split"
"spoil"
"spoof"
"spook"
"spool"
"spoon"
"spore"
"sport"
"spout"
"spray"
"spree"
"sprig"
"spunk"
"spurn"
"spurt"
"squad"
"squat"
"squaw"
"squib"
"squid"
"ssdna"
"stack"
"staff"
"stage"
"staid"
"stain"
"stair"
"stake"
"stale"
"stalk"
"stall"
"stamp"
"stand"
"staph"
"stare"
"stark"
"starr"
"start"
"stash"
"state"
"stats"
"stave"
"stays"
"stead"
"steak"
"steal"
"steam"
"steed"
"steel"
"steep"
"steer"
"stein"
"stent"
"stern"
"steve"
"stick"
"stiff"
"stile"
"still"
"stilt"
"sting"
"stink"
"stint"
"stipe"
"stoat"
"stock"
"stoic"
"stoke"
"stomp"
"stone"
"stony"
"stood"
"stool"
"stoop"
"store"
"stork"
"storm"
"story"
"stout"
"stove"
"strap"
"straw"
"stray"
"strep"
"strew"
"strip"
"strom"
"strum"
"strut"
"stuck"
"study"
"stuff"
"stump"
"stunt"
"stupa"
"style"
"suave"
"sucky"
"sudan"
"suede"
"sugar"
"suite"
"sulfo"
"sulky"
"sully"
"sumac"
"sumer"
"sunny"
"super"
"supra"
"surge"
"surly"
"susan"
"sushi"
"sutra"
"swain"
"swamp"
"swank"
"sward"
"swarm"
"swath"
"swear"
"sweat"
"swede"
"sweep"
"sweet"
"swell"
"swept"
"swift"
"swill"
"swine"
"swing"
"swipe"
"swirl"
"swish"
"swiss"
"swoon"
"swoop"
"sword"
"syria"
"syrup"
"tabby"
"table"
"taboo"
"tacit"
"tacky"
"tagus"
"taint"
"taker"
"talky"
"tally"
"talon"
"tamed"
"tamer"
"tamil"
"tammy"
"tampa"
"tango"
"tangy"
"taper"
"tapir"
"tardy"
"tarot"
"taser"
"taste"
"tasty"
"tater"
"taunt"
"tawny"
"taxol"
"taxon"
"teach"
"teary"
"tease"
"teddy"
"teens"
"teeny"
"telex"
"telly"
"tempo"
"tempt"
"tenet"
"tenor"
"tense"
"tenth"
"tepee"
"tepid"
"terms"
"terra"
"terry"
"terse"
"tesla"
"testy"
"texan"
"texas"
"thank"
"thebe"
"theca"
"theft"
"their"
"theme"
"there"
"these"
"theta"
"thick"
"thief"
"thigh"
"thine"
"thing"
"think"
"thiol"
"third"
"thong"
"thorn"
"those"
"three"
"throb"
"throw"
"thumb"
"thump"
"thyme"
"tiara"
"tibet"
"tibia"
"tidal"
"tiger"
"tight"
"tiled"
"timer"
"times"
"timid"
"timmy"
"timor"
"tinge"
"tinny"
"tipsy"
"tired"
"titan"
"titer"
"tithe"
"title"
"toady"
"toast"
"today"
"toddy"
"token"
"tokyo"
"tommy"
"tonal"
"toner"
"tonga"
"tongs"
"tonic"
"tonus"
"tooth"
"topaz"
"topic"
"toque"
"torah"
"torch"
"torso"
"torus"
"tosca"
"total"
"totem"
"touch"
"tough"
"towed"
"towel"
"tower"
"toxic"
"toxin"
"toyed"
"trace"
"track"
"tract"
"tracy"
"trade"
"trail"
"train"
"trait"
"tramp"
"trans"
"trash"
"trawl"
"tread"
"treat"
"trend"
"trent"
"tress"
"triad"
"trial"
"tribe"
"trick"
"tried"
"trier"
"trill"
"tripe"
"tripp"
"trite"
"troll"
"tromp"
"troop"
"trope"
"trout"
"trove"
"truce"
"truck"
"truer"
"truly"
"trump"
"trunk"
"truss"
"trust"
"truth"
"tryst"
"tubby"
"tuber"
"tudor"
"tulip"
"tulle"
"tummy"
"tumor"
"tuner"
"tunic"
"tunny"
"turbo"
"turin"
"tutor"
"twain"
"twang"
"tweak"
"tweed"
"tween"
"tweet"
"twice"
"twill"
"twine"
"twirl"
"twist"
"tyler"
"tyson"
"udder"
"ulcer"
"ultra"
"uncle"
"uncut"
"under"
"undue"
"unfit"
"unhip"
"unify"
"union"
"unite"
"unity"
"unmet"
"untie"
"until"
"unwed"
"unzip"
"upend"
"upper"
"upset"
"urban"
"urine"
"usage"
"usair"
"usepa"
"usher"
"using"
"usual"
"usurp"
"utero"
"utter"
"uvula"
"uzbek"
"vague"
"valet"
"valid"
"valor"
"value"
"valve"
"vapid"
"vapor"
"vault"
"vaunt"
"vegan"
"vegas"
"venal"
"venom"
"venue"
"venus"
"verdi"
"verge"
"versa"
"verse"
"verve"
"vexed"
"vibes"
"vicar"
"video"
"vigil"
"vigor"
"villa"
"vinyl"
"viola"
"vioxx"
"viper"
"viral"
"virgo"
"virus"
"visit"
"visor"
"vista"
"vital"
"vitis"
"vitro"
"vivid"
"vixen"
"vocal"
"vodka"
"vogue"
"voice"
"volvo"
"vomit"
"voter"
"vouch"
"vowel"
"wacko"
"wacky"
"wafer"
"wager"
"wages"
"wagon"
"wahoo"
"waist"
"waive"
"waken"
"wales"
"wally"
"walsh"
"waltz"
"wanna"
"wares"
"waste"
"watch"
"water"
"waver"
"wayne"
"weary"
"weave"
"wedge"
"weeny"
"weepy"
"weigh"
"weird"
"welch"
"welsh"
"wendy"
"whack"
"whale"
"wharf"
"wheat"
"wheel"
"where"
"which"
"whiff"
"while"
"whine"
"whiny"
"whirl"
"whisk"
"whist"
"white"
"whizz"
"whole"
"whoop"
"whore"
"whorl"
"whose"
"wicca"
"widen"
"wider"
"widow"
"width"
"wield"
"wight"
"wilco"
"wilde"
"willy"
"wimpy"
"wince"
"winch"
"windy"
"wiper"
"wiser"
"wispy"
"witch"
"witty"
"woman"
"women"
"wonky"
"woody"
"wooly"
"woozy"
"wordy"
"works"
"world"
"worry"
"worse"
"worst"
"worth"
"would"
"wound"
"wrack"
"wrath"
"wreak"
"wreck"
"wrest"
"wring"
"wrist"
"write"
"wrong"
"xerox"
"xpost"
"xylem"
"yacht"
"yadda"
"yahoo"
"yearn"
"yeast"
"yemen"
"yield"
"yodel"
"yoked"
"yokel"
"young"
"yours"
"youth"
"yucca"
"yucky"
"yukon"
"yummy"
"zaire"
"zebra"
"zeiss"
"zemin"
"zilch"
"zippy"
"zorro"
])
