package com.plcoding.cryptotracker.core.presentation.util

import com.plcoding.cryptotracker.R

fun getDrawableIdForCoin(symbol: String): Int =
    when (symbol.uppercase()) {
        "1INCH" -> R.drawable._inch
        "ST" -> R.drawable._st
        "XBTC" -> R.drawable._xbtc
        "AAVE" -> R.drawable.aave
        "ABBC" -> R.drawable.abbc
        "ABT" -> R.drawable.abt
        "AC3" -> R.drawable.ac3
        "ACT" -> R.drawable.act
        "ADA" -> R.drawable.ada
        "ADB" -> R.drawable.adb
        "ADX" -> R.drawable.adx
        "AE" -> R.drawable.ae
        "AEON" -> R.drawable.aeon
        "AERGO" -> R.drawable.aergo
        "AGI" -> R.drawable.agi
        "AION" -> R.drawable.aion
        "AIT" -> R.drawable.ait
        "AKRO" -> R.drawable.akro
        "AKT" -> R.drawable.akt
        "ALCX" -> R.drawable.alcx
        "ALEPH" -> R.drawable.aleph
        "ALGO" -> R.drawable.algo
        "ALIS" -> R.drawable.alis
        "ALPHA" -> R.drawable.alpha
        "ALX" -> R.drawable.alx
        "AMB" -> R.drawable.amb
        "AMLT" -> R.drawable.amlt
        "AMP" -> R.drawable.amp
        "AMPL" -> R.drawable.ampl
        "ANC" -> R.drawable.anc
        "ANJ" -> R.drawable.anj
        "ANKR" -> R.drawable.ankr
        "ANT" -> R.drawable.ant
        "APH" -> R.drawable.aph
        "APL" -> R.drawable.apl
        "APPC" -> R.drawable.appc
        "APW" -> R.drawable.apw
        "APY" -> R.drawable.apy
        "AR" -> R.drawable.ar
        "ARDR" -> R.drawable.ardr
        "ARK" -> R.drawable.ark
        "ARMOR" -> R.drawable.armor
        "ARN" -> R.drawable.arn
        "ARO" -> R.drawable.aro
        "ARRR" -> R.drawable.arrr
        "AST" -> R.drawable.ast
        "ATMI" -> R.drawable.atmi
        "ATOM" -> R.drawable.atom
        "AUC" -> R.drawable.auc
        "AURA" -> R.drawable.aura
        "AUTO" -> R.drawable.auto
        "AVAX" -> R.drawable.avax
        "AWC" -> R.drawable.awc
        "AXP" -> R.drawable.axp
        "BAC" -> R.drawable.bac
        "BAL" -> R.drawable.bal
        "BAND" -> R.drawable.band
        "BAO" -> R.drawable.bao
        "BAT" -> R.drawable.bat
        "BAY" -> R.drawable.bay
        "BBR" -> R.drawable.bbr
        "BCD" -> R.drawable.bcd
        "BCH" -> R.drawable.bch
        "BCHA" -> R.drawable.bcha
        "BCN" -> R.drawable.bcn
        "BCO" -> R.drawable.bco
        "BEL" -> R.drawable.bel
        "BETA" -> R.drawable.beta
        "BF" -> R.drawable.bf
        "BIFI" -> R.drawable.bifi
        "BIX" -> R.drawable.bix
        "BLK" -> R.drawable.blk
        "BLOCK" -> R.drawable.block
        "BLT" -> R.drawable.blt
        "BLUE" -> R.drawable.blue
        "BLZ" -> R.drawable.blz
        "BNB" -> R.drawable.bnb
        "BNT" -> R.drawable.bnt
        "BOND" -> R.drawable.bond
        "BONDLY" -> R.drawable.bondly
        "BORA" -> R.drawable.bora
        "BOX" -> R.drawable.box
        "BPT" -> R.drawable.bpt
        "BRD" -> R.drawable.brd
        "BTC" -> R.drawable.btc
        "BTC_" -> R.drawable.btc__
        "BTCP" -> R.drawable.btcp
        "BTG" -> R.drawable.btg
        "BTMX" -> R.drawable.btmx
        "BTO" -> R.drawable.bto
        "BTS" -> R.drawable.bts
        "BTT" -> R.drawable.btt
        "BTU" -> R.drawable.btu
        "BU" -> R.drawable.bu
        "BUNNY" -> R.drawable.bunny
        "BUSD" -> R.drawable.busd
        "BWT" -> R.drawable.bwt
        "BZ" -> R.drawable.bz
        "BZNT" -> R.drawable.bznt
        "BZRX" -> R.drawable.bzrx
        "C20" -> R.drawable.c20
        "C98" -> R.drawable.c98
        "CAKE" -> R.drawable.cake
        "CAPP" -> R.drawable.capp
        "CAR" -> R.drawable.car
        "CARD" -> R.drawable.card
        "CBAT" -> R.drawable.cbat
        "CBT" -> R.drawable.cbt
        "CDAI" -> R.drawable.cdai
        "CDT" -> R.drawable.cdt
        "CEL" -> R.drawable.cel
        "CELO" -> R.drawable.celo
        "CELR" -> R.drawable.celr
        "CENNZ" -> R.drawable.cennz
        "CETH" -> R.drawable.ceth
        "CFX" -> R.drawable.cfx
        "CHAI" -> R.drawable.chai
        "CHAT" -> R.drawable.chat
        "CHSB" -> R.drawable.chsb
        "CHZ" -> R.drawable.chz
        "CKB" -> R.drawable.ckb
        "CLO" -> R.drawable.clo
        "CLOAK" -> R.drawable.cloak
        "CLOUT" -> R.drawable.clout
        "CMT" -> R.drawable.cmt
        "CND" -> R.drawable.cnd
        "CNX" -> R.drawable.cnx
        "COMP" -> R.drawable.comp
        "CONI" -> R.drawable.coni
        "COSM" -> R.drawable.cosm
        "COTI" -> R.drawable.coti
        "COV" -> R.drawable.cov
        "COVA" -> R.drawable.cova
        "COVER" -> R.drawable.cover
        "CPC" -> R.drawable.cpc
        "CRE" -> R.drawable.cre
        "CREAM" -> R.drawable.cream
        "CRED" -> R.drawable.cred
        "CREP" -> R.drawable.crep
        "CRO" -> R.drawable.cro
        "CRPT" -> R.drawable.crpt
        "CRV" -> R.drawable.crv
        "CS" -> R.drawable.cs
        "CSAI" -> R.drawable.csai
        "CSC" -> R.drawable.csc
        "CTC" -> R.drawable.ctc
        "CTXC" -> R.drawable.ctxc
        "CUSDC" -> R.drawable.cusdc
        "CV" -> R.drawable.cv
        "CVC" -> R.drawable.cvc
        "CVP" -> R.drawable.cvp
        "CVT" -> R.drawable.cvt
        "CVX" -> R.drawable.cvx
        "CWBTC" -> R.drawable.cwbtc
        "CZR" -> R.drawable.czrx
        "DADI" -> R.drawable.dadi
        "DAFI" -> R.drawable.dafi
        "DAG" -> R.drawable.dag
        "DAI" -> R.drawable.dai
        "DASH" -> R.drawable.dash
        "DAT" -> R.drawable.dat
        "DATA" -> R.drawable.data
        "DATX" -> R.drawable.datx
        "DBC" -> R.drawable.dbc
        "DCN" -> R.drawable.dcn
        "DCR" -> R.drawable.dcr
        "DCT" -> R.drawable.dct
        "DDD" -> R.drawable.ddd
        "DENT" -> R.drawable.dent
        "DERI" -> R.drawable.deri
        "DFI" -> R.drawable.dfi
        "DFT" -> R.drawable.dft
        "DFYN" -> R.drawable.dfyn
        "DGB" -> R.drawable.dgb
        "DGD" -> R.drawable.dgd
        "DGTX" -> R.drawable.dgtx
        "DIVI" -> R.drawable.divi
        "DLT" -> R.drawable.dlt
        "DMT" -> R.drawable.dmt
        "DNT" -> R.drawable.dnt
        "DOCK" -> R.drawable.dock
        "DODO" -> R.drawable.dodo
        "DOGE" -> R.drawable.doge
        "DOR" -> R.drawable.dor
        "DOT" -> R.drawable.dot
        "DRGN" -> R.drawable.drgn
        "DROP" -> R.drawable.drop
        "DTA" -> R.drawable.dta
        "DTR" -> R.drawable.dtr
        "DTX" -> R.drawable.dtx
        "DVF" -> R.drawable.dvf
        "DXD" -> R.drawable.dxd
        "DXT" -> R.drawable.dxt
        "EDG" -> R.drawable.edg
        "EDO" -> R.drawable.edo
        "EFI" -> R.drawable.efi
        "EFX" -> R.drawable.efx
        "EGLD" -> R.drawable.egld
        "EGT" -> R.drawable.egt
        "EKG" -> R.drawable.ekg
        "EKT" -> R.drawable.ekt
        "ELA" -> R.drawable.ela
        "ELEC" -> R.drawable.elec
        "ELF" -> R.drawable.elf
        "EMC" -> R.drawable.emc
        "EMC2" -> R.drawable.emc2
        "ENG" -> R.drawable.eng
        "ENJ" -> R.drawable.enj
        "EOS" -> R.drawable.eos
        "EOSDAC" -> R.drawable.eosdac
        "ERN" -> R.drawable.ern
        "ESD" -> R.drawable.esd
        "ESP" -> R.drawable.esp
        "ESS" -> R.drawable.ess
        "ETC" -> R.drawable.etc
        "ETH" -> R.drawable.eth
        "ETN" -> R.drawable.etn
        "ETP" -> R.drawable.etp
        "ETZ" -> R.drawable.etz
        "EVX" -> R.drawable.evx
        "EWT" -> R.drawable.ewt
        "EXRN" -> R.drawable.exrn
        "EXY" -> R.drawable.exy
        "FAB" -> R.drawable.fab
        "FCT" -> R.drawable.fct
        "FEED" -> R.drawable.feed
        "FEI" -> R.drawable.fei
        "FET" -> R.drawable.fet
        "FIDA" -> R.drawable.fida
        "FIL" -> R.drawable.fil
        "FILDA" -> R.drawable.filda
        "FLOW" -> R.drawable.flow
        "FOTA" -> R.drawable.fota
        "FOX" -> R.drawable.fox
        "FRAX" -> R.drawable.frax
        "FRM" -> R.drawable.frm
        "FRONT" -> R.drawable.front
        "FSN" -> R.drawable.fsn
        "FT" -> R.drawable.ft
        "FTC" -> R.drawable.ftc
        "FTM" -> R.drawable.ftm
        "FTT" -> R.drawable.ftt
        "FUEL" -> R.drawable.fuel
        "FUN" -> R.drawable.`fun`
        "FXC" -> R.drawable.fxc
        "FXT" -> R.drawable.fxt
        "GALA" -> R.drawable.gala
        "GDC" -> R.drawable.gdc
        "GEM" -> R.drawable.gem
        "GEN" -> R.drawable.gen
        "GNO" -> R.drawable.gno
        "GNT" -> R.drawable.gnt
        "GNX" -> R.drawable.gnx
        "GO" -> R.drawable.go
        "GOC" -> R.drawable.goc
        "GOT" -> R.drawable.got
        "GRIN" -> R.drawable.grin
        "GRS" -> R.drawable.grs
        "GRT" -> R.drawable.grt
        "GSC" -> R.drawable.gsc
        "GSWAP" -> R.drawable.gswap
        "GT" -> R.drawable.gt
        "GTC" -> R.drawable.gtc
        "GTO" -> R.drawable.gto
        "GUSD" -> R.drawable.gusd
        "GVT" -> R.drawable.gvt
        "GXS" -> R.drawable.gxs
        "HAKKA" -> R.drawable.hakka
        "HBAR" -> R.drawable.hbar
        "HC" -> R.drawable.hc
        "HEDG" -> R.drawable.hedg
        "HER" -> R.drawable.her
        "HEX" -> R.drawable.hex
        "HIGH" -> R.drawable.high
        "HIVE" -> R.drawable.hive
        "HNT" -> R.drawable.hnt
        "HOT" -> R.drawable.hot
        "HOT_X" -> R.drawable.hot_x
        "HPB" -> R.drawable.hpb
        "HSR" -> R.drawable.hsr
        "HT" -> R.drawable.ht
        "HUM" -> R.drawable.hum
        "HUSD" -> R.drawable.husd
        "HVN" -> R.drawable.hvn
        "HYDRO" -> R.drawable.hydro
        "HYN" -> R.drawable.hyn
        "HZN" -> R.drawable.hzn
        "IBAT" -> R.drawable.ibat
        "ICN" -> R.drawable.icn
        "ICP" -> R.drawable.icp
        "ICX" -> R.drawable.icx
        "IDAI" -> R.drawable.idai
        "IDEX" -> R.drawable.idex
        "IETH" -> R.drawable.ieth
        "IGNIS" -> R.drawable.ignis
        "IKNC" -> R.drawable.iknc
        "ILINK" -> R.drawable.ilink
        "INB" -> R.drawable.inb
        "INS" -> R.drawable.ins
        "IOST" -> R.drawable.iost
        "IOTA" -> R.drawable.iota
        "IOTX" -> R.drawable.iotx
        "IQ" -> R.drawable.iq
        "IREP" -> R.drawable.irep
        "IRIS" -> R.drawable.iris
        "ISUSD" -> R.drawable.isusd
        "IUSDC" -> R.drawable.iusdc
        "IWBTC" -> R.drawable.iwbtc
        "IZRX" -> R.drawable.izrx
        "JNT" -> R.drawable.jnt
        "JST" -> R.drawable.jst
        "JUNO" -> R.drawable.juno
        "KAVA" -> R.drawable.kava
        "KCS" -> R.drawable.kcs
        "KDA" -> R.drawable.kda
        "KEEP" -> R.drawable.keep
        "KEY" -> R.drawable.key
        "KICK" -> R.drawable.kick
        "KIN" -> R.drawable.kin
        "KLAY" -> R.drawable.klay
        "KLV" -> R.drawable.klv
        "KMD" -> R.drawable.kmd
        "KNC" -> R.drawable.knc
        "KSM" -> R.drawable.ksm
        "LAMB" -> R.drawable.lamb
        "LAND" -> R.drawable.land
        "LBA" -> R.drawable.lba
        "LCX" -> R.drawable.lcx
        "LDO" -> R.drawable.ldo
        "LEND" -> R.drawable.lend
        "LEO" -> R.drawable.leo
        "LINK" -> R.drawable.link
        "LIT" -> R.drawable.lit
        "LKY" -> R.drawable.lky
        "LN" -> R.drawable.ln
        "LOKI" -> R.drawable.loki
        "LON" -> R.drawable.lon
        "LOOKS" -> R.drawable.looks
        "LOOM" -> R.drawable.loom
        "LPT" -> R.drawable.lpt
        "LQD" -> R.drawable.lqd
        "LQTY" -> R.drawable.lqty
        "LRC" -> R.drawable.lrc
        "LSK" -> R.drawable.lsk
        "LTC" -> R.drawable.ltc
        "LTO" -> R.drawable.lto
        "LUN" -> R.drawable.lun
        "LUNA" -> R.drawable.luna
        "LXT" -> R.drawable.lxt
        "LYM" -> R.drawable.lym
        "MAHA" -> R.drawable.maha
        "MAID" -> R.drawable.maid
        "MAN" -> R.drawable.man
        "MANA" -> R.drawable.mana
        "MATH" -> R.drawable.math
        "MATIC" -> R.drawable.matic
        "MATTER" -> R.drawable.matter
        "MBC" -> R.drawable.mbc
        "MCO" -> R.drawable.mco
        "MCX" -> R.drawable.mcx
        "MDA" -> R.drawable.mda
        "MDS" -> R.drawable.mds
        "MED" -> R.drawable.med
        "MEDX" -> R.drawable.medx
        "MET" -> R.drawable.met
        "MFG" -> R.drawable.mfg
        "MFT" -> R.drawable.mft
        "MIM" -> R.drawable.mim
        "MIR" -> R.drawable.mir
        "MITH" -> R.drawable.mith
        "MKR" -> R.drawable.mkr
        "MLN" -> R.drawable.mln
        "MNGO" -> R.drawable.mngo
        "MOD" -> R.drawable.mod
        "MOT" -> R.drawable.mot
        "MPL" -> R.drawable.mpl
        "MTA" -> R.drawable.mta
        "MTH" -> R.drawable.mth
        "MTL" -> R.drawable.mtl
        "MTN" -> R.drawable.mtn
        "MVC" -> R.drawable.mvc
        "MVL" -> R.drawable.mvl
        "MVP" -> R.drawable.mvp
        "MWAT" -> R.drawable.mwat
        "MWC" -> R.drawable.mwc
        "MXM" -> R.drawable.mxm
        "MYB" -> R.drawable.myb
        "NANO" -> R.drawable.nano
        "NAS" -> R.drawable.nas
        "NAV" -> R.drawable.nav
        "NCASH" -> R.drawable.ncash
        "NCT" -> R.drawable.nct
        "NEAR" -> R.drawable.near
        "NEBL" -> R.drawable.nebl
        "NEC" -> R.drawable.nec
        "NEO" -> R.drawable.neo
        "NEX" -> R.drawable.nex
        "NEXXO" -> R.drawable.nexxo
        "NFT" -> R.drawable.nft
        "NGC" -> R.drawable.ngc
        "NIOX" -> R.drawable.niox
        "NKN" -> R.drawable.nkn
        "NLG" -> R.drawable.nlg
        "NMR" -> R.drawable.nmr
        "NOIA" -> R.drawable.noia
        "NPER" -> R.drawable.nper
        "NPXS" -> R.drawable.npxs
        "NRG" -> R.drawable.nrg
        "NRVE" -> R.drawable.nrve
        "NU" -> R.drawable.nu
        "NULS" -> R.drawable.nuls
        "NXS" -> R.drawable.nxs
        "OAG" -> R.drawable.oag
        "OAX" -> R.drawable.oax
        "OCEAN" -> R.drawable.ocean
        "OCN" -> R.drawable.ocn
        "ODE" -> R.drawable.ode
        "OGN" -> R.drawable.ogn
        "OHM" -> R.drawable.ohm
        "OKB" -> R.drawable.okb
        "OLT" -> R.drawable.olt
        "OMG" -> R.drawable.omg
        "ONE" -> R.drawable.one
        "ONION" -> R.drawable.onion
        "ONT" -> R.drawable.ont
        "OPEN" -> R.drawable.open
        "OPIUM" -> R.drawable.opium
        "ORBS" -> R.drawable.orbs
        "ORC" -> R.drawable.orc
        "ORN" -> R.drawable.orn
        "OSMO" -> R.drawable.osmo
        "OST" -> R.drawable.ost
        "OVC" -> R.drawable.ovc
        "OXT" -> R.drawable.oxt
        "PAI" -> R.drawable.pai
        "PAINT" -> R.drawable.paint
        "PAL" -> R.drawable.pal
        "PAR" -> R.drawable.par
        "PART" -> R.drawable.part
        "PAX" -> R.drawable.pax
        "PAXG" -> R.drawable.paxg
        "PAY" -> R.drawable.pay
        "PBR" -> R.drawable.pbr
        "PBTC" -> R.drawable.pbtc
        "PENDLE" -> R.drawable.pendle
        "PERL" -> R.drawable.perl
        "PERP" -> R.drawable.perp
        "PICKLE" -> R.drawable.pickle
        "PIVX" -> R.drawable.pivx
        "PLAY" -> R.drawable.play
        "PLDAI" -> R.drawable.pldai
        "PLR" -> R.drawable.plr
        "PLUSDC" -> R.drawable.plusdc
        "PNG" -> R.drawable.png
        "PNK" -> R.drawable.pnk
        "PNT" -> R.drawable.pnt
        "POA" -> R.drawable.poa
        "POE" -> R.drawable.poe
        "POKT" -> R.drawable.pokt
        "POLS" -> R.drawable.pols
        "POLY" -> R.drawable.poly
        "POND" -> R.drawable.pond
        "POOL" -> R.drawable.pool
        "POWR" -> R.drawable.powr
        "PPAY" -> R.drawable.ppay
        "PPC" -> R.drawable.ppc
        "PPP" -> R.drawable.ppp
        "PPT" -> R.drawable.ppt
        "PRE" -> R.drawable.pre
        "PREMIA" -> R.drawable.premia
        "PRL" -> R.drawable.prl
        "PRO" -> R.drawable.pro
        "PROS" -> R.drawable.pros
        "PRQ" -> R.drawable.prq
        "PST" -> R.drawable.pst
        "QASH" -> R.drawable.qash
        "QBIT" -> R.drawable.qbit
        "QI" -> R.drawable.qi
        "QKC" -> R.drawable.qkc
        "QLC" -> R.drawable.qlc
        "QNT" -> R.drawable.qnt
        "QSP" -> R.drawable.qsp
        "QTUM" -> R.drawable.qtum
        "QUICK" -> R.drawable.quick
        "R" -> R.drawable.r
        "RAE" -> R.drawable.rae
        "RARI" -> R.drawable.rari
        "RAY" -> R.drawable.ray
        "RCN" -> R.drawable.rcn
        "RDD" -> R.drawable.rdd
        "RDN" -> R.drawable.rdn
        "REN" -> R.drawable.ren
        "REP" -> R.drawable.rep
        "REQ" -> R.drawable.req
        "RESOURCE_NEW" -> R.drawable.resource_new
        "RESOURCE_SUPER" -> R.drawable.resource_super
        "REV" -> R.drawable.rev
        "RFOX" -> R.drawable.rfox
        "RHOC" -> R.drawable.rhoc
        "RIF" -> R.drawable.rif
        "RLC" -> R.drawable.rlc
        "ROOK" -> R.drawable.rook
        "ROSE" -> R.drawable.rose
        "RPX" -> R.drawable.rpx
        "RSR" -> R.drawable.rsr
        "RSV" -> R.drawable.rsv
        "RUNE" -> R.drawable.rune
        "RVN" -> R.drawable.rvn
        "S" -> R.drawable.s
        "SAI" -> R.drawable.sai
        "SALT" -> R.drawable.salt
        "SAN" -> R.drawable.san
        "SAND" -> R.drawable.sand
        "SAR" -> R.drawable.sar
        "SCRL" -> R.drawable.scrl
        "SCRT" -> R.drawable.scrt
        "SDT" -> R.drawable.sdt
        "SEELE" -> R.drawable.seele
        "SEFI" -> R.drawable.sefi
        "SEM" -> R.drawable.sem
        "SFI" -> R.drawable.sfi
        "SFP" -> R.drawable.sfp
        "SHIB" -> R.drawable.shib
        "SHR" -> R.drawable.shr
        "SHUF" -> R.drawable.shuf
        "SIA" -> R.drawable.sia
        "SKL" -> R.drawable.skl
        "SKY" -> R.drawable.sky
        "SLT" -> R.drawable.slt
        "SMART" -> R.drawable.smart
        "SNC" -> R.drawable.snc
        "SNGLS" -> R.drawable.sngls
        "SNM" -> R.drawable.snm
        "SNT" -> R.drawable.snt
        "SNX" -> R.drawable.snx
        "SOL" -> R.drawable.sol
        "SOUL" -> R.drawable.soul
        "SOV" -> R.drawable.sov
        "SPN" -> R.drawable.spn
        "SRM" -> R.drawable.srm
        "STAKE" -> R.drawable.stake
        "STEEM" -> R.drawable.steem
        "STEP" -> R.drawable.step
        "STETH" -> R.drawable.steth
        "STMX" -> R.drawable.stmx
        "STORJ" -> R.drawable.storj
        "STORM" -> R.drawable.storm
        "STPT" -> R.drawable.stpt
        "STRAT" -> R.drawable.strat
        "STX" -> R.drawable.stx
        "SUB" -> R.drawable.sub
        "SUQA" -> R.drawable.suqa
        "SUSHI" -> R.drawable.sushi
        "SUTER" -> R.drawable.suter
        "SWAP" -> R.drawable.swap
        "SWTH" -> R.drawable.swth
        "SXDT" -> R.drawable.sxdt
        "SXP" -> R.drawable.sxp
        "SYS" -> R.drawable.sys
        "TBTC" -> R.drawable.tbtc
        "TCT" -> R.drawable.tct
        "TEL" -> R.drawable.tel
        "TFUEL" -> R.drawable.tfuel
        "THC" -> R.drawable.thc
        "THETA" -> R.drawable.theta
        "THR" -> R.drawable.thr
        "TIO" -> R.drawable.tio
        "TITAN" -> R.drawable.titan
        "TKN" -> R.drawable.tkn
        "TKY" -> R.drawable.tky
        "TNB" -> R.drawable.tnb
        "TNC" -> R.drawable.tnc
        "TNT" -> R.drawable.tnt
        "TOMO" -> R.drawable.tomo
        "TORN" -> R.drawable.torn
        "TPAY" -> R.drawable.tpay
        "TRAC" -> R.drawable.trac
        "TRB" -> R.drawable.trb
        "TRIBE" -> R.drawable.tribe
        "TRIG" -> R.drawable.trig
        "TRTL" -> R.drawable.trtl
        "TRU" -> R.drawable.tru
        "TRX" -> R.drawable.trx
        "TRYB" -> R.drawable.tryb
        "TUBE" -> R.drawable.tube
        "TUSD" -> R.drawable.tusd
        "TWT" -> R.drawable.twt
        "UBQ" -> R.drawable.ubq
        "UBT" -> R.drawable.ubt
        "UFT" -> R.drawable.uft
        "ULT" -> R.drawable.ult
        "UMA" -> R.drawable.uma
        "UNCX" -> R.drawable.uncx
        "UNFI" -> R.drawable.unfi
        "UNI" -> R.drawable.uni
        "UNN" -> R.drawable.unn
        "UOS" -> R.drawable.uos
        "UPP" -> R.drawable.upp
        "USDC" -> R.drawable.usdc
        "USDP" -> R.drawable.usdp
        "USDS" -> R.drawable.usds
        "USDT" -> R.drawable.usdt
        "UTK" -> R.drawable.utk
        "UUU" -> R.drawable.uuu
        "VALUE" -> R.drawable.value
        "VERI" -> R.drawable.veri
        "VEST" -> R.drawable.vest
        "VET" -> R.drawable.vet
        "VGX" -> R.drawable.vgx
        "VIA" -> R.drawable.via
        "VIB" -> R.drawable.vib
        "VIBE" -> R.drawable.vibe
        "VIDT" -> R.drawable.vidt
        "VIKKY" -> R.drawable.vikky
        "VIN" -> R.drawable.vin
        "VITE" -> R.drawable.vite
        "VIU" -> R.drawable.viu
        "VLX" -> R.drawable.vlx
        "VRS" -> R.drawable.vrs
        "VSP" -> R.drawable.vsp
        "VSYS" -> R.drawable.vsys
        "VTC" -> R.drawable.vtc
        "WABI" -> R.drawable.wabi
        "WAN" -> R.drawable.wan
        "WAVES" -> R.drawable.waves
        "WBTC" -> R.drawable.wbtc
        "WCT" -> R.drawable.wct
        "WEXPOLY" -> R.drawable.wexpoly
        "WHALE" -> R.drawable.whale
        "WIB" -> R.drawable.wib
        "WING" -> R.drawable.wing
        "WINGS" -> R.drawable.wings
        "WOO" -> R.drawable.woo
        "WPR" -> R.drawable.wpr
        "WRX" -> R.drawable.wrx
        "WTC" -> R.drawable.wtc
        "WXT" -> R.drawable.wxt
        "XAS" -> R.drawable.xas
        "XCHF" -> R.drawable.xchf
        "XEM" -> R.drawable.xem
        "XHV" -> R.drawable.xhv
        "XIN" -> R.drawable.xin
        "XLM" -> R.drawable.xlm
        "XLQ" -> R.drawable.xlq
        "XMARK" -> R.drawable.xmark
        "XMR" -> R.drawable.xmr
        "XMX" -> R.drawable.xmx
        "XNK" -> R.drawable.xnk
        "XNS" -> R.drawable.xns
        "XOR" -> R.drawable.xor
        "XRD" -> R.drawable.xrd
        "XRP" -> R.drawable.xrp
        "XSN" -> R.drawable.xsn
        "XSR" -> R.drawable.xsr
        "XTZ" -> R.drawable.xtz
        "XVG" -> R.drawable.xvg
        "XYO" -> R.drawable.xyo
        "XZC" -> R.drawable.xzc
        "YFI" -> R.drawable.yfi
        "YOYO" -> R.drawable.yoyo
        "ZAI" -> R.drawable.zai
        "ZB" -> R.drawable.zb
        "ZCO" -> R.drawable.zco
        "ZEC" -> R.drawable.zec
        "ZEN" -> R.drawable.zen
        "ZIL" -> R.drawable.zil
        "ZKS" -> R.drawable.zks
        "ZRX" -> R.drawable.zrx
        else -> R.drawable.question_sign
    }
