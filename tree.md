## 项目目录结构 20150225

.
|-- Book.iml
|-- MaterialTabsModule
|   |-- MaterialTabsModule.iml
|   |-- build
|   |   |-- generated
|   |   |   |-- res
|   |   |   |   |-- generated
|   |   |   |   |   `-- test
|   |   |   |   `-- rs
|   |   |   |       |-- debug
|   |   |   |       `-- test
|   |   |   |           `-- debug
|   |   |   `-- source
|   |   |       |-- aidl
|   |   |       |   |-- debug
|   |   |       |   `-- test
|   |   |       |       `-- debug
|   |   |       |-- buildConfig
|   |   |       |   |-- debug
|   |   |       |   |   `-- it
|   |   |       |   |       `-- neokree
|   |   |       |   |           `-- materialtabs
|   |   |       |   |               `-- BuildConfig.java
|   |   |       |   `-- test
|   |   |       |       `-- debug
|   |   |       |           `-- it
|   |   |       |               `-- neokree
|   |   |       |                   `-- materialtabs
|   |   |       |                       `-- test
|   |   |       |                           `-- BuildConfig.java
|   |   |       |-- r
|   |   |       |   |-- debug
|   |   |       |   |   `-- it
|   |   |       |   |       `-- neokree
|   |   |       |   |           `-- materialtabs
|   |   |       |   |               `-- R.java
|   |   |       |   `-- test
|   |   |       |       `-- debug
|   |   |       |           |-- android
|   |   |       |           |   `-- support
|   |   |       |           |       `-- v7
|   |   |       |           |           `-- appcompat
|   |   |       |           |               `-- R.java
|   |   |       |           |-- at
|   |   |       |           |   `-- markushi
|   |   |       |           |       `-- ui
|   |   |       |           |           `-- R.java
|   |   |       |           `-- it
|   |   |       |               `-- neokree
|   |   |       |                   `-- materialtabs
|   |   |       |                       |-- R.java
|   |   |       |                       `-- test
|   |   |       |                           `-- R.java
|   |   |       `-- rs
|   |   |           |-- debug
|   |   |           `-- test
|   |   |               `-- debug
|   |   |-- intermediates
|   |   |   |-- annotations
|   |   |   |   `-- debug
|   |   |   |-- assets
|   |   |   |   `-- test
|   |   |   |       `-- debug
|   |   |   |-- bundles
|   |   |   |   `-- debug
|   |   |   |       |-- AndroidManifest.xml
|   |   |   |       |-- R.txt
|   |   |   |       |-- aidl
|   |   |   |       |-- assets
|   |   |   |       |-- classes.jar
|   |   |   |       `-- res
|   |   |   |           |-- drawable-hdpi-v4
|   |   |   |           |   |-- left_arrow.png
|   |   |   |           |   `-- right_arrow.png
|   |   |   |           |-- drawable-mdpi-v4
|   |   |   |           |   |-- left_arrow.png
|   |   |   |           |   `-- right_arrow.png
|   |   |   |           |-- drawable-xhdpi-v4
|   |   |   |           |   |-- left_arrow.png
|   |   |   |           |   `-- right_arrow.png
|   |   |   |           |-- drawable-xxhdpi-v4
|   |   |   |           |   |-- left_arrow.png
|   |   |   |           |   `-- right_arrow.png
|   |   |   |           |-- drawable-xxxhdpi-v4
|   |   |   |           |   |-- left_arrow.png
|   |   |   |           |   `-- right_arrow.png
|   |   |   |           |-- layout
|   |   |   |           |   |-- material_tab.xml
|   |   |   |           |   |-- material_tab_icon.xml
|   |   |   |           |   |-- tab.xml
|   |   |   |           |   `-- tab_icon.xml
|   |   |   |           |-- values
|   |   |   |           |   `-- values.xml
|   |   |   |           `-- values-sw600dp-v13
|   |   |   |               `-- values.xml
|   |   |   |-- classes
|   |   |   |   `-- debug
|   |   |   |       `-- it
|   |   |   |           `-- neokree
|   |   |   |               `-- materialtabs
|   |   |   |                   |-- BuildConfig.class
|   |   |   |                   |-- MaterialTab$1.class
|   |   |   |                   |-- MaterialTab.class
|   |   |   |                   |-- MaterialTabHost.class
|   |   |   |                   |-- MaterialTabListener.class
|   |   |   |                   |-- R$anim.class
|   |   |   |                   |-- R$attr.class
|   |   |   |                   |-- R$bool.class
|   |   |   |                   |-- R$color.class
|   |   |   |                   |-- R$dimen.class
|   |   |   |                   |-- R$drawable.class
|   |   |   |                   |-- R$id.class
|   |   |   |                   |-- R$integer.class
|   |   |   |                   |-- R$layout.class
|   |   |   |                   |-- R$string.class
|   |   |   |                   |-- R$style.class
|   |   |   |                   |-- R$styleable.class
|   |   |   |                   `-- R.class
|   |   |   |-- dependency-cache
|   |   |   |   `-- debug
|   |   |   |-- exploded-aar
|   |   |   |   |-- com.android.support
|   |   |   |   |   |-- appcompat-v7
|   |   |   |   |   |   `-- 21.0.3
|   |   |   |   |   |       |-- AndroidManifest.xml
|   |   |   |   |   |       |-- R.txt
|   |   |   |   |   |       |-- assets
|   |   |   |   |   |       |-- classes.jar
|   |   |   |   |   |       `-- res
|   |   |   |   |   |           |-- anim
|   |   |   |   |   |           |   |-- abc_fade_in.xml
|   |   |   |   |   |           |   |-- abc_fade_out.xml
|   |   |   |   |   |           |   |-- abc_slide_in_bottom.xml
|   |   |   |   |   |           |   |-- abc_slide_in_top.xml
|   |   |   |   |   |           |   |-- abc_slide_out_bottom.xml
|   |   |   |   |   |           |   `-- abc_slide_out_top.xml
|   |   |   |   |   |           |-- color
|   |   |   |   |   |           |   |-- abc_background_cache_hint_selector_material_dark.xml
|   |   |   |   |   |           |   |-- abc_background_cache_hint_selector_material_light.xml
|   |   |   |   |   |           |   |-- abc_primary_text_disable_only_material_dark.xml
|   |   |   |   |   |           |   |-- abc_primary_text_disable_only_material_light.xml
|   |   |   |   |   |           |   |-- abc_primary_text_material_dark.xml
|   |   |   |   |   |           |   |-- abc_primary_text_material_light.xml
|   |   |   |   |   |           |   |-- abc_search_url_text.xml
|   |   |   |   |   |           |   |-- abc_secondary_text_material_dark.xml
|   |   |   |   |   |           |   `-- abc_secondary_text_material_light.xml
|   |   |   |   |   |           |-- drawable
|   |   |   |   |   |           |   |-- abc_btn_check_material.xml
|   |   |   |   |   |           |   |-- abc_btn_radio_material.xml
|   |   |   |   |   |           |   |-- abc_cab_background_internal_bg.xml
|   |   |   |   |   |           |   |-- abc_cab_background_top_material.xml
|   |   |   |   |   |           |   |-- abc_edit_text_material.xml
|   |   |   |   |   |           |   |-- abc_item_background_holo_dark.xml
|   |   |   |   |   |           |   |-- abc_item_background_holo_light.xml
|   |   |   |   |   |           |   |-- abc_list_selector_background_transition_holo_dark.xml
|   |   |   |   |   |           |   |-- abc_list_selector_background_transition_holo_light.xml
|   |   |   |   |   |           |   |-- abc_list_selector_holo_dark.xml
|   |   |   |   |   |           |   |-- abc_list_selector_holo_light.xml
|   |   |   |   |   |           |   |-- abc_switch_thumb_material.xml
|   |   |   |   |   |           |   |-- abc_tab_indicator_material.xml
|   |   |   |   |   |           |   `-- abc_textfield_search_material.xml
|   |   |   |   |   |           |-- drawable-hdpi
|   |   |   |   |   |           |   |-- abc_ab_share_pack_holo_dark.9.png
|   |   |   |   |   |           |   |-- abc_ab_share_pack_holo_light.9.png
|   |   |   |   |   |           |   |-- abc_btn_check_to_on_mtrl_000.png
|   |   |   |   |   |           |   |-- abc_btn_check_to_on_mtrl_015.png
|   |   |   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_000.png
|   |   |   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_015.png
|   |   |   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00001.9.png
|   |   |   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00012.9.png
|   |   |   |   |   |           |   |-- abc_cab_background_top_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_clear_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_commit_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_go_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_moreoverflow_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_paste_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_selectall_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_share_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_voice_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_list_divider_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_list_focused_holo.9.png
|   |   |   |   |   |           |   |-- abc_list_longpressed_holo.9.png
|   |   |   |   |   |           |   |-- abc_list_pressed_holo_dark.9.png
|   |   |   |   |   |           |   |-- abc_list_pressed_holo_light.9.png
|   |   |   |   |   |           |   |-- abc_list_selector_disabled_holo_dark.9.png
|   |   |   |   |   |           |   |-- abc_list_selector_disabled_holo_light.9.png
|   |   |   |   |   |           |   |-- abc_menu_hardkey_panel_mtrl_mult.9.png
|   |   |   |   |   |           |   |-- abc_popup_background_mtrl_mult.9.png
|   |   |   |   |   |           |   |-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |           |   |-- abc_switch_track_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_tab_indicator_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_textfield_activated_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_textfield_default_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_textfield_search_activated_mtrl_alpha.9.png
|   |   |   |   |   |           |   `-- abc_textfield_search_default_mtrl_alpha.9.png
|   |   |   |   |   |           |-- drawable-ldrtl-hdpi
|   |   |   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |           |   `-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |           |-- drawable-ldrtl-mdpi
|   |   |   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |           |   `-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |           |-- drawable-ldrtl-xhdpi
|   |   |   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |           |   `-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |           |-- drawable-ldrtl-xxhdpi
|   |   |   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |           |   `-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |           |-- drawable-ldrtl-xxxhdpi
|   |   |   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |           |   `-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |           |-- drawable-mdpi
|   |   |   |   |   |           |   |-- abc_ab_share_pack_holo_dark.9.png
|   |   |   |   |   |           |   |-- abc_ab_share_pack_holo_light.9.png
|   |   |   |   |   |           |   |-- abc_btn_check_to_on_mtrl_000.png
|   |   |   |   |   |           |   |-- abc_btn_check_to_on_mtrl_015.png
|   |   |   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_000.png
|   |   |   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_015.png
|   |   |   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00001.9.png
|   |   |   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00012.9.png
|   |   |   |   |   |           |   |-- abc_cab_background_top_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_clear_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_commit_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_go_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_moreoverflow_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_paste_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_selectall_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_share_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_voice_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_list_divider_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_list_focused_holo.9.png
|   |   |   |   |   |           |   |-- abc_list_longpressed_holo.9.png
|   |   |   |   |   |           |   |-- abc_list_pressed_holo_dark.9.png
|   |   |   |   |   |           |   |-- abc_list_pressed_holo_light.9.png
|   |   |   |   |   |           |   |-- abc_list_selector_disabled_holo_dark.9.png
|   |   |   |   |   |           |   |-- abc_list_selector_disabled_holo_light.9.png
|   |   |   |   |   |           |   |-- abc_menu_hardkey_panel_mtrl_mult.9.png
|   |   |   |   |   |           |   |-- abc_popup_background_mtrl_mult.9.png
|   |   |   |   |   |           |   |-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |           |   |-- abc_switch_track_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_tab_indicator_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_textfield_activated_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_textfield_default_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_textfield_search_activated_mtrl_alpha.9.png
|   |   |   |   |   |           |   `-- abc_textfield_search_default_mtrl_alpha.9.png
|   |   |   |   |   |           |-- drawable-xhdpi
|   |   |   |   |   |           |   |-- abc_ab_share_pack_holo_dark.9.png
|   |   |   |   |   |           |   |-- abc_ab_share_pack_holo_light.9.png
|   |   |   |   |   |           |   |-- abc_btn_check_to_on_mtrl_000.png
|   |   |   |   |   |           |   |-- abc_btn_check_to_on_mtrl_015.png
|   |   |   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_000.png
|   |   |   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_015.png
|   |   |   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00001.9.png
|   |   |   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00012.9.png
|   |   |   |   |   |           |   |-- abc_cab_background_top_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_clear_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_commit_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_go_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_moreoverflow_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_paste_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_selectall_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_share_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_voice_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_list_divider_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_list_focused_holo.9.png
|   |   |   |   |   |           |   |-- abc_list_longpressed_holo.9.png
|   |   |   |   |   |           |   |-- abc_list_pressed_holo_dark.9.png
|   |   |   |   |   |           |   |-- abc_list_pressed_holo_light.9.png
|   |   |   |   |   |           |   |-- abc_list_selector_disabled_holo_dark.9.png
|   |   |   |   |   |           |   |-- abc_list_selector_disabled_holo_light.9.png
|   |   |   |   |   |           |   |-- abc_menu_hardkey_panel_mtrl_mult.9.png
|   |   |   |   |   |           |   |-- abc_popup_background_mtrl_mult.9.png
|   |   |   |   |   |           |   |-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |           |   |-- abc_switch_track_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_tab_indicator_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_textfield_activated_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_textfield_default_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_textfield_search_activated_mtrl_alpha.9.png
|   |   |   |   |   |           |   `-- abc_textfield_search_default_mtrl_alpha.9.png
|   |   |   |   |   |           |-- drawable-xxhdpi
|   |   |   |   |   |           |   |-- abc_ab_share_pack_holo_dark.9.png
|   |   |   |   |   |           |   |-- abc_ab_share_pack_holo_light.9.png
|   |   |   |   |   |           |   |-- abc_btn_check_to_on_mtrl_000.png
|   |   |   |   |   |           |   |-- abc_btn_check_to_on_mtrl_015.png
|   |   |   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_000.png
|   |   |   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_015.png
|   |   |   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00001.9.png
|   |   |   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00012.9.png
|   |   |   |   |   |           |   |-- abc_cab_background_top_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_clear_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_commit_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_go_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_moreoverflow_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_paste_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_selectall_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_share_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_voice_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_list_divider_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_list_focused_holo.9.png
|   |   |   |   |   |           |   |-- abc_list_longpressed_holo.9.png
|   |   |   |   |   |           |   |-- abc_list_pressed_holo_dark.9.png
|   |   |   |   |   |           |   |-- abc_list_pressed_holo_light.9.png
|   |   |   |   |   |           |   |-- abc_list_selector_disabled_holo_dark.9.png
|   |   |   |   |   |           |   |-- abc_list_selector_disabled_holo_light.9.png
|   |   |   |   |   |           |   |-- abc_menu_hardkey_panel_mtrl_mult.9.png
|   |   |   |   |   |           |   |-- abc_popup_background_mtrl_mult.9.png
|   |   |   |   |   |           |   |-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |           |   |-- abc_switch_track_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_tab_indicator_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_textfield_activated_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_textfield_default_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_textfield_search_activated_mtrl_alpha.9.png
|   |   |   |   |   |           |   `-- abc_textfield_search_default_mtrl_alpha.9.png
|   |   |   |   |   |           |-- drawable-xxxhdpi
|   |   |   |   |   |           |   |-- abc_btn_check_to_on_mtrl_000.png
|   |   |   |   |   |           |   |-- abc_btn_check_to_on_mtrl_015.png
|   |   |   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_000.png
|   |   |   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_015.png
|   |   |   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00001.9.png
|   |   |   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00012.9.png
|   |   |   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_clear_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_moreoverflow_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_paste_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_selectall_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_voice_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |           |   |-- abc_switch_track_mtrl_alpha.9.png
|   |   |   |   |   |           |   `-- abc_tab_indicator_mtrl_alpha.9.png
|   |   |   |   |   |           |-- layout
|   |   |   |   |   |           |   |-- abc_action_bar_title_item.xml
|   |   |   |   |   |           |   |-- abc_action_bar_up_container.xml
|   |   |   |   |   |           |   |-- abc_action_bar_view_list_nav_layout.xml
|   |   |   |   |   |           |   |-- abc_action_menu_item_layout.xml
|   |   |   |   |   |           |   |-- abc_action_menu_layout.xml
|   |   |   |   |   |           |   |-- abc_action_mode_bar.xml
|   |   |   |   |   |           |   |-- abc_action_mode_close_item_material.xml
|   |   |   |   |   |           |   |-- abc_activity_chooser_view.xml
|   |   |   |   |   |           |   |-- abc_activity_chooser_view_include.xml
|   |   |   |   |   |           |   |-- abc_activity_chooser_view_list_item.xml
|   |   |   |   |   |           |   |-- abc_expanded_menu_layout.xml
|   |   |   |   |   |           |   |-- abc_list_menu_item_checkbox.xml
|   |   |   |   |   |           |   |-- abc_list_menu_item_icon.xml
|   |   |   |   |   |           |   |-- abc_list_menu_item_layout.xml
|   |   |   |   |   |           |   |-- abc_list_menu_item_radio.xml
|   |   |   |   |   |           |   |-- abc_popup_menu_item_layout.xml
|   |   |   |   |   |           |   |-- abc_screen_content_include.xml
|   |   |   |   |   |           |   |-- abc_screen_simple.xml
|   |   |   |   |   |           |   |-- abc_screen_simple_overlay_action_mode.xml
|   |   |   |   |   |           |   |-- abc_screen_toolbar.xml
|   |   |   |   |   |           |   |-- abc_search_dropdown_item_icons_2line.xml
|   |   |   |   |   |           |   |-- abc_search_view.xml
|   |   |   |   |   |           |   |-- abc_simple_dropdown_hint.xml
|   |   |   |   |   |           |   `-- support_simple_spinner_dropdown_item.xml
|   |   |   |   |   |           |-- layout-v11
|   |   |   |   |   |           |   `-- abc_screen_content_include.xml
|   |   |   |   |   |           |-- values
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-af
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-am
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-ar
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-bg
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-bn-rBD
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-ca
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-cs
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-da
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-de
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-el
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-en-rGB
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-en-rIN
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-es
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-es-rUS
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-et-rEE
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-eu-rES
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-fa
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-fi
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-fr
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-fr-rCA
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-gl-rES
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-hi
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-hr
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-hu
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-hy-rAM
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-in
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-is-rIS
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-it
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-iw
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-ja
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-ka-rGE
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-kk-rKZ
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-km-rKH
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-kn-rIN
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-ko
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-ky-rKG
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-land
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-large
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-lo-rLA
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-lt
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-lv
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-mk-rMK
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-ml-rIN
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-mn-rMN
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-mr-rIN
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-ms-rMY
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-my-rMM
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-nb
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-ne-rNP
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-nl
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-pl
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-port
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-pt
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-pt-rPT
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-ro
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-ru
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-si-rLK
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-sk
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-sl
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-sr
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-sv
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-sw
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-sw600dp
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-ta-rIN
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-te-rIN
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-th
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-tl
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-tr
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-uk
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-ur-rPK
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-uz-rUZ
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-v11
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-v14
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-v17
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-v21
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-vi
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-w360dp
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-w480dp
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-w500dp
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-w600dp
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-w720dp
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-xlarge
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-xlarge-land
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-zh-rCN
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-zh-rHK
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-zh-rTW
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           `-- values-zu
|   |   |   |   |   |               `-- values.xml
|   |   |   |   |   `-- support-v4
|   |   |   |   |       `-- 21.0.3
|   |   |   |   |           |-- AndroidManifest.xml
|   |   |   |   |           |-- aidl
|   |   |   |   |           |   `-- android
|   |   |   |   |           |       `-- support
|   |   |   |   |           |           `-- v4
|   |   |   |   |           |               |-- accessibilityservice
|   |   |   |   |           |               |-- app
|   |   |   |   |           |               |   `-- INotificationSideChannel.aidl
|   |   |   |   |           |               |-- content
|   |   |   |   |           |               |   |-- pm
|   |   |   |   |           |               |   `-- res
|   |   |   |   |           |               |-- database
|   |   |   |   |           |               |-- graphics
|   |   |   |   |           |               |   `-- drawable
|   |   |   |   |           |               |-- hardware
|   |   |   |   |           |               |   `-- display
|   |   |   |   |           |               |-- internal
|   |   |   |   |           |               |   `-- view
|   |   |   |   |           |               |-- media
|   |   |   |   |           |               |   `-- session
|   |   |   |   |           |               |-- net
|   |   |   |   |           |               |-- os
|   |   |   |   |           |               |-- print
|   |   |   |   |           |               |-- provider
|   |   |   |   |           |               |-- text
|   |   |   |   |           |               |-- util
|   |   |   |   |           |               |-- view
|   |   |   |   |           |               |   `-- accessibility
|   |   |   |   |           |               `-- widget
|   |   |   |   |           |-- assets
|   |   |   |   |           |-- classes.jar
|   |   |   |   |           |-- libs
|   |   |   |   |           |   `-- internal_impl-21.0.3.jar
|   |   |   |   |           `-- res
|   |   |   |   `-- com.github.markushi
|   |   |   |       `-- android-ui
|   |   |   |           `-- 1.2
|   |   |   |               |-- AndroidManifest.xml
|   |   |   |               |-- R.txt
|   |   |   |               |-- aidl
|   |   |   |               |-- assets
|   |   |   |               |-- classes.jar
|   |   |   |               `-- res
|   |   |   |                   `-- values
|   |   |   |                       `-- values.xml
|   |   |   |-- incremental
|   |   |   |   |-- aidl
|   |   |   |   |   |-- debug
|   |   |   |   |   |   `-- dependency.store
|   |   |   |   |   `-- test
|   |   |   |   |       `-- debug
|   |   |   |   |           `-- dependency.store
|   |   |   |   |-- mergeAssets
|   |   |   |   |   |-- debug
|   |   |   |   |   |   `-- merger.xml
|   |   |   |   |   `-- test
|   |   |   |   |       `-- debug
|   |   |   |   |           `-- merger.xml
|   |   |   |   |-- mergeResources
|   |   |   |   |   |-- debug
|   |   |   |   |   |   `-- merger.xml
|   |   |   |   |   `-- test
|   |   |   |   |       `-- debug
|   |   |   |   |           `-- merger.xml
|   |   |   |   `-- packageResources
|   |   |   |       `-- debug
|   |   |   |           `-- merger.xml
|   |   |   |-- lint
|   |   |   |-- manifests
|   |   |   |   |-- test
|   |   |   |   |   `-- debug
|   |   |   |   |       `-- AndroidManifest.xml
|   |   |   |   `-- tmp
|   |   |   |       `-- manifestMerger3328780674126962022.xml
|   |   |   |-- ndk
|   |   |   |   `-- debug
|   |   |   |       |-- lib
|   |   |   |       `-- obj
|   |   |   |-- res
|   |   |   |   |-- debug
|   |   |   |   |   |-- anim
|   |   |   |   |   |   |-- abc_fade_in.xml
|   |   |   |   |   |   |-- abc_fade_out.xml
|   |   |   |   |   |   |-- abc_slide_in_bottom.xml
|   |   |   |   |   |   |-- abc_slide_in_top.xml
|   |   |   |   |   |   |-- abc_slide_out_bottom.xml
|   |   |   |   |   |   `-- abc_slide_out_top.xml
|   |   |   |   |   |-- color
|   |   |   |   |   |   |-- abc_background_cache_hint_selector_material_dark.xml
|   |   |   |   |   |   |-- abc_background_cache_hint_selector_material_light.xml
|   |   |   |   |   |   |-- abc_primary_text_disable_only_material_dark.xml
|   |   |   |   |   |   |-- abc_primary_text_disable_only_material_light.xml
|   |   |   |   |   |   |-- abc_primary_text_material_dark.xml
|   |   |   |   |   |   |-- abc_primary_text_material_light.xml
|   |   |   |   |   |   |-- abc_search_url_text.xml
|   |   |   |   |   |   |-- abc_secondary_text_material_dark.xml
|   |   |   |   |   |   `-- abc_secondary_text_material_light.xml
|   |   |   |   |   |-- drawable
|   |   |   |   |   |   |-- abc_btn_check_material.xml
|   |   |   |   |   |   |-- abc_btn_radio_material.xml
|   |   |   |   |   |   |-- abc_cab_background_internal_bg.xml
|   |   |   |   |   |   |-- abc_cab_background_top_material.xml
|   |   |   |   |   |   |-- abc_edit_text_material.xml
|   |   |   |   |   |   |-- abc_item_background_holo_dark.xml
|   |   |   |   |   |   |-- abc_item_background_holo_light.xml
|   |   |   |   |   |   |-- abc_list_selector_background_transition_holo_dark.xml
|   |   |   |   |   |   |-- abc_list_selector_background_transition_holo_light.xml
|   |   |   |   |   |   |-- abc_list_selector_holo_dark.xml
|   |   |   |   |   |   |-- abc_list_selector_holo_light.xml
|   |   |   |   |   |   |-- abc_switch_thumb_material.xml
|   |   |   |   |   |   |-- abc_tab_indicator_material.xml
|   |   |   |   |   |   `-- abc_textfield_search_material.xml
|   |   |   |   |   |-- drawable-hdpi-v4
|   |   |   |   |   |   |-- abc_ab_share_pack_holo_dark.9.png
|   |   |   |   |   |   |-- abc_ab_share_pack_holo_light.9.png
|   |   |   |   |   |   |-- abc_btn_check_to_on_mtrl_000.png
|   |   |   |   |   |   |-- abc_btn_check_to_on_mtrl_015.png
|   |   |   |   |   |   |-- abc_btn_radio_to_on_mtrl_000.png
|   |   |   |   |   |   |-- abc_btn_radio_to_on_mtrl_015.png
|   |   |   |   |   |   |-- abc_btn_switch_to_on_mtrl_00001.9.png
|   |   |   |   |   |   |-- abc_btn_switch_to_on_mtrl_00012.9.png
|   |   |   |   |   |   |-- abc_cab_background_top_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_clear_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_commit_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_go_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_moreoverflow_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_paste_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_selectall_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_share_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_voice_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_list_divider_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_list_focused_holo.9.png
|   |   |   |   |   |   |-- abc_list_longpressed_holo.9.png
|   |   |   |   |   |   |-- abc_list_pressed_holo_dark.9.png
|   |   |   |   |   |   |-- abc_list_pressed_holo_light.9.png
|   |   |   |   |   |   |-- abc_list_selector_disabled_holo_dark.9.png
|   |   |   |   |   |   |-- abc_list_selector_disabled_holo_light.9.png
|   |   |   |   |   |   |-- abc_menu_hardkey_panel_mtrl_mult.9.png
|   |   |   |   |   |   |-- abc_popup_background_mtrl_mult.9.png
|   |   |   |   |   |   |-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |   |-- abc_switch_track_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_tab_indicator_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_activated_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_default_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_search_activated_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_search_default_mtrl_alpha.9.png
|   |   |   |   |   |   |-- left_arrow.png
|   |   |   |   |   |   `-- right_arrow.png
|   |   |   |   |   |-- drawable-ldrtl-hdpi-v17
|   |   |   |   |   |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |   `-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |-- drawable-ldrtl-mdpi-v17
|   |   |   |   |   |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |   `-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |-- drawable-ldrtl-xhdpi-v17
|   |   |   |   |   |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |   `-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |-- drawable-ldrtl-xxhdpi-v17
|   |   |   |   |   |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |   `-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |-- drawable-ldrtl-xxxhdpi-v17
|   |   |   |   |   |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |   `-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |-- drawable-mdpi-v4
|   |   |   |   |   |   |-- abc_ab_share_pack_holo_dark.9.png
|   |   |   |   |   |   |-- abc_ab_share_pack_holo_light.9.png
|   |   |   |   |   |   |-- abc_btn_check_to_on_mtrl_000.png
|   |   |   |   |   |   |-- abc_btn_check_to_on_mtrl_015.png
|   |   |   |   |   |   |-- abc_btn_radio_to_on_mtrl_000.png
|   |   |   |   |   |   |-- abc_btn_radio_to_on_mtrl_015.png
|   |   |   |   |   |   |-- abc_btn_switch_to_on_mtrl_00001.9.png
|   |   |   |   |   |   |-- abc_btn_switch_to_on_mtrl_00012.9.png
|   |   |   |   |   |   |-- abc_cab_background_top_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_clear_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_commit_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_go_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_moreoverflow_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_paste_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_selectall_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_share_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_voice_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_list_divider_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_list_focused_holo.9.png
|   |   |   |   |   |   |-- abc_list_longpressed_holo.9.png
|   |   |   |   |   |   |-- abc_list_pressed_holo_dark.9.png
|   |   |   |   |   |   |-- abc_list_pressed_holo_light.9.png
|   |   |   |   |   |   |-- abc_list_selector_disabled_holo_dark.9.png
|   |   |   |   |   |   |-- abc_list_selector_disabled_holo_light.9.png
|   |   |   |   |   |   |-- abc_menu_hardkey_panel_mtrl_mult.9.png
|   |   |   |   |   |   |-- abc_popup_background_mtrl_mult.9.png
|   |   |   |   |   |   |-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |   |-- abc_switch_track_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_tab_indicator_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_activated_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_default_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_search_activated_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_search_default_mtrl_alpha.9.png
|   |   |   |   |   |   |-- left_arrow.png
|   |   |   |   |   |   `-- right_arrow.png
|   |   |   |   |   |-- drawable-xhdpi-v4
|   |   |   |   |   |   |-- abc_ab_share_pack_holo_dark.9.png
|   |   |   |   |   |   |-- abc_ab_share_pack_holo_light.9.png
|   |   |   |   |   |   |-- abc_btn_check_to_on_mtrl_000.png
|   |   |   |   |   |   |-- abc_btn_check_to_on_mtrl_015.png
|   |   |   |   |   |   |-- abc_btn_radio_to_on_mtrl_000.png
|   |   |   |   |   |   |-- abc_btn_radio_to_on_mtrl_015.png
|   |   |   |   |   |   |-- abc_btn_switch_to_on_mtrl_00001.9.png
|   |   |   |   |   |   |-- abc_btn_switch_to_on_mtrl_00012.9.png
|   |   |   |   |   |   |-- abc_cab_background_top_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_clear_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_commit_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_go_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_moreoverflow_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_paste_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_selectall_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_share_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_voice_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_list_divider_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_list_focused_holo.9.png
|   |   |   |   |   |   |-- abc_list_longpressed_holo.9.png
|   |   |   |   |   |   |-- abc_list_pressed_holo_dark.9.png
|   |   |   |   |   |   |-- abc_list_pressed_holo_light.9.png
|   |   |   |   |   |   |-- abc_list_selector_disabled_holo_dark.9.png
|   |   |   |   |   |   |-- abc_list_selector_disabled_holo_light.9.png
|   |   |   |   |   |   |-- abc_menu_hardkey_panel_mtrl_mult.9.png
|   |   |   |   |   |   |-- abc_popup_background_mtrl_mult.9.png
|   |   |   |   |   |   |-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |   |-- abc_switch_track_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_tab_indicator_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_activated_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_default_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_search_activated_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_search_default_mtrl_alpha.9.png
|   |   |   |   |   |   |-- left_arrow.png
|   |   |   |   |   |   `-- right_arrow.png
|   |   |   |   |   |-- drawable-xxhdpi-v4
|   |   |   |   |   |   |-- abc_ab_share_pack_holo_dark.9.png
|   |   |   |   |   |   |-- abc_ab_share_pack_holo_light.9.png
|   |   |   |   |   |   |-- abc_btn_check_to_on_mtrl_000.png
|   |   |   |   |   |   |-- abc_btn_check_to_on_mtrl_015.png
|   |   |   |   |   |   |-- abc_btn_radio_to_on_mtrl_000.png
|   |   |   |   |   |   |-- abc_btn_radio_to_on_mtrl_015.png
|   |   |   |   |   |   |-- abc_btn_switch_to_on_mtrl_00001.9.png
|   |   |   |   |   |   |-- abc_btn_switch_to_on_mtrl_00012.9.png
|   |   |   |   |   |   |-- abc_cab_background_top_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_clear_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_commit_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_go_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_moreoverflow_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_paste_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_selectall_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_share_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_voice_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_list_divider_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_list_focused_holo.9.png
|   |   |   |   |   |   |-- abc_list_longpressed_holo.9.png
|   |   |   |   |   |   |-- abc_list_pressed_holo_dark.9.png
|   |   |   |   |   |   |-- abc_list_pressed_holo_light.9.png
|   |   |   |   |   |   |-- abc_list_selector_disabled_holo_dark.9.png
|   |   |   |   |   |   |-- abc_list_selector_disabled_holo_light.9.png
|   |   |   |   |   |   |-- abc_menu_hardkey_panel_mtrl_mult.9.png
|   |   |   |   |   |   |-- abc_popup_background_mtrl_mult.9.png
|   |   |   |   |   |   |-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |   |-- abc_switch_track_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_tab_indicator_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_activated_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_default_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_search_activated_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_search_default_mtrl_alpha.9.png
|   |   |   |   |   |   |-- left_arrow.png
|   |   |   |   |   |   `-- right_arrow.png
|   |   |   |   |   |-- drawable-xxxhdpi-v4
|   |   |   |   |   |   |-- abc_btn_check_to_on_mtrl_000.png
|   |   |   |   |   |   |-- abc_btn_check_to_on_mtrl_015.png
|   |   |   |   |   |   |-- abc_btn_radio_to_on_mtrl_000.png
|   |   |   |   |   |   |-- abc_btn_radio_to_on_mtrl_015.png
|   |   |   |   |   |   |-- abc_btn_switch_to_on_mtrl_00001.9.png
|   |   |   |   |   |   |-- abc_btn_switch_to_on_mtrl_00012.9.png
|   |   |   |   |   |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_clear_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_moreoverflow_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_paste_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_selectall_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_voice_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |   |-- abc_switch_track_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_tab_indicator_mtrl_alpha.9.png
|   |   |   |   |   |   |-- left_arrow.png
|   |   |   |   |   |   `-- right_arrow.png
|   |   |   |   |   |-- layout
|   |   |   |   |   |   |-- abc_action_bar_title_item.xml
|   |   |   |   |   |   |-- abc_action_bar_up_container.xml
|   |   |   |   |   |   |-- abc_action_bar_view_list_nav_layout.xml
|   |   |   |   |   |   |-- abc_action_menu_item_layout.xml
|   |   |   |   |   |   |-- abc_action_menu_layout.xml
|   |   |   |   |   |   |-- abc_action_mode_bar.xml
|   |   |   |   |   |   |-- abc_action_mode_close_item_material.xml
|   |   |   |   |   |   |-- abc_activity_chooser_view.xml
|   |   |   |   |   |   |-- abc_activity_chooser_view_include.xml
|   |   |   |   |   |   |-- abc_activity_chooser_view_list_item.xml
|   |   |   |   |   |   |-- abc_expanded_menu_layout.xml
|   |   |   |   |   |   |-- abc_list_menu_item_checkbox.xml
|   |   |   |   |   |   |-- abc_list_menu_item_icon.xml
|   |   |   |   |   |   |-- abc_list_menu_item_layout.xml
|   |   |   |   |   |   |-- abc_list_menu_item_radio.xml
|   |   |   |   |   |   |-- abc_popup_menu_item_layout.xml
|   |   |   |   |   |   |-- abc_screen_content_include.xml
|   |   |   |   |   |   |-- abc_screen_simple.xml
|   |   |   |   |   |   |-- abc_screen_simple_overlay_action_mode.xml
|   |   |   |   |   |   |-- abc_screen_toolbar.xml
|   |   |   |   |   |   |-- abc_search_dropdown_item_icons_2line.xml
|   |   |   |   |   |   |-- abc_search_view.xml
|   |   |   |   |   |   |-- abc_simple_dropdown_hint.xml
|   |   |   |   |   |   |-- material_tab.xml
|   |   |   |   |   |   |-- material_tab_icon.xml
|   |   |   |   |   |   |-- support_simple_spinner_dropdown_item.xml
|   |   |   |   |   |   |-- tab.xml
|   |   |   |   |   |   `-- tab_icon.xml
|   |   |   |   |   |-- layout-v11
|   |   |   |   |   |   `-- abc_screen_content_include.xml
|   |   |   |   |   |-- values
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-af
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-am
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-ar
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-bg
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-bn-rBD
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-ca
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-cs
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-da
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-de
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-el
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-en-rGB
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-en-rIN
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-es
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-es-rUS
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-et-rEE
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-eu-rES
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-fa
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-fi
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-fr
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-fr-rCA
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-gl-rES
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-hi
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-hr
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-hu
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-hy-rAM
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-in
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-is-rIS
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-it
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-iw
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-ja
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-ka-rGE
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-kk-rKZ
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-km-rKH
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-kn-rIN
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-ko
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-ky-rKG
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-land
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-large-v4
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-lo-rLA
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-lt
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-lv
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-mk-rMK
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-ml-rIN
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-mn-rMN
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-mr-rIN
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-ms-rMY
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-my-rMM
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-nb
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-ne-rNP
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-nl
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-pl
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-port
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-pt
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-pt-rPT
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-ro
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-ru
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-si-rLK
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-sk
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-sl
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-sr
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-sv
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-sw
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-sw600dp-v13
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-ta-rIN
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-te-rIN
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-th
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-tl
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-tr
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-uk
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-ur-rPK
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-uz-rUZ
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-v11
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-v14
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-v17
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-v21
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-vi
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-w360dp-v13
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-w480dp-v13
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-w500dp-v13
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-w600dp-v13
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-w720dp-v13
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-xlarge-land-v4
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-xlarge-v4
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-zh-rCN
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-zh-rHK
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-zh-rTW
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   `-- values-zu
|   |   |   |   |       `-- values.xml
|   |   |   |   |-- resources-debug-test.ap_
|   |   |   |   `-- test
|   |   |   |       `-- debug
|   |   |   |           |-- anim
|   |   |   |           |   |-- abc_fade_in.xml
|   |   |   |           |   |-- abc_fade_out.xml
|   |   |   |           |   |-- abc_slide_in_bottom.xml
|   |   |   |           |   |-- abc_slide_in_top.xml
|   |   |   |           |   |-- abc_slide_out_bottom.xml
|   |   |   |           |   `-- abc_slide_out_top.xml
|   |   |   |           |-- color
|   |   |   |           |   |-- abc_background_cache_hint_selector_material_dark.xml
|   |   |   |           |   |-- abc_background_cache_hint_selector_material_light.xml
|   |   |   |           |   |-- abc_primary_text_disable_only_material_dark.xml
|   |   |   |           |   |-- abc_primary_text_disable_only_material_light.xml
|   |   |   |           |   |-- abc_primary_text_material_dark.xml
|   |   |   |           |   |-- abc_primary_text_material_light.xml
|   |   |   |           |   |-- abc_search_url_text.xml
|   |   |   |           |   |-- abc_secondary_text_material_dark.xml
|   |   |   |           |   `-- abc_secondary_text_material_light.xml
|   |   |   |           |-- drawable
|   |   |   |           |   |-- abc_btn_check_material.xml
|   |   |   |           |   |-- abc_btn_radio_material.xml
|   |   |   |           |   |-- abc_cab_background_internal_bg.xml
|   |   |   |           |   |-- abc_cab_background_top_material.xml
|   |   |   |           |   |-- abc_edit_text_material.xml
|   |   |   |           |   |-- abc_item_background_holo_dark.xml
|   |   |   |           |   |-- abc_item_background_holo_light.xml
|   |   |   |           |   |-- abc_list_selector_background_transition_holo_dark.xml
|   |   |   |           |   |-- abc_list_selector_background_transition_holo_light.xml
|   |   |   |           |   |-- abc_list_selector_holo_dark.xml
|   |   |   |           |   |-- abc_list_selector_holo_light.xml
|   |   |   |           |   |-- abc_switch_thumb_material.xml
|   |   |   |           |   |-- abc_tab_indicator_material.xml
|   |   |   |           |   `-- abc_textfield_search_material.xml
|   |   |   |           |-- drawable-hdpi-v4
|   |   |   |           |   |-- abc_ab_share_pack_holo_dark.9.png
|   |   |   |           |   |-- abc_ab_share_pack_holo_light.9.png
|   |   |   |           |   |-- abc_btn_check_to_on_mtrl_000.png
|   |   |   |           |   |-- abc_btn_check_to_on_mtrl_015.png
|   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_000.png
|   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_015.png
|   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00001.9.png
|   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00012.9.png
|   |   |   |           |   |-- abc_cab_background_top_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |           |   |-- abc_ic_clear_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_commit_search_api_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_go_search_api_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_menu_moreoverflow_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_menu_paste_mtrl_am_alpha.png
|   |   |   |           |   |-- abc_ic_menu_selectall_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_menu_share_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_search_api_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_voice_search_api_mtrl_alpha.png
|   |   |   |           |   |-- abc_list_divider_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_list_focused_holo.9.png
|   |   |   |           |   |-- abc_list_longpressed_holo.9.png
|   |   |   |           |   |-- abc_list_pressed_holo_dark.9.png
|   |   |   |           |   |-- abc_list_pressed_holo_light.9.png
|   |   |   |           |   |-- abc_list_selector_disabled_holo_dark.9.png
|   |   |   |           |   |-- abc_list_selector_disabled_holo_light.9.png
|   |   |   |           |   |-- abc_menu_hardkey_panel_mtrl_mult.9.png
|   |   |   |           |   |-- abc_popup_background_mtrl_mult.9.png
|   |   |   |           |   |-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |           |   |-- abc_switch_track_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_tab_indicator_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_textfield_activated_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_textfield_default_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_textfield_search_activated_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_textfield_search_default_mtrl_alpha.9.png
|   |   |   |           |   |-- left_arrow.png
|   |   |   |           |   `-- right_arrow.png
|   |   |   |           |-- drawable-ldrtl-hdpi-v17
|   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |           |   `-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |           |-- drawable-ldrtl-mdpi-v17
|   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |           |   `-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |           |-- drawable-ldrtl-xhdpi-v17
|   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |           |   `-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |           |-- drawable-ldrtl-xxhdpi-v17
|   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |           |   `-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |           |-- drawable-ldrtl-xxxhdpi-v17
|   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |           |   `-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |           |-- drawable-mdpi-v4
|   |   |   |           |   |-- abc_ab_share_pack_holo_dark.9.png
|   |   |   |           |   |-- abc_ab_share_pack_holo_light.9.png
|   |   |   |           |   |-- abc_btn_check_to_on_mtrl_000.png
|   |   |   |           |   |-- abc_btn_check_to_on_mtrl_015.png
|   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_000.png
|   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_015.png
|   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00001.9.png
|   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00012.9.png
|   |   |   |           |   |-- abc_cab_background_top_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |           |   |-- abc_ic_clear_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_commit_search_api_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_go_search_api_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_menu_moreoverflow_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_menu_paste_mtrl_am_alpha.png
|   |   |   |           |   |-- abc_ic_menu_selectall_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_menu_share_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_search_api_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_voice_search_api_mtrl_alpha.png
|   |   |   |           |   |-- abc_list_divider_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_list_focused_holo.9.png
|   |   |   |           |   |-- abc_list_longpressed_holo.9.png
|   |   |   |           |   |-- abc_list_pressed_holo_dark.9.png
|   |   |   |           |   |-- abc_list_pressed_holo_light.9.png
|   |   |   |           |   |-- abc_list_selector_disabled_holo_dark.9.png
|   |   |   |           |   |-- abc_list_selector_disabled_holo_light.9.png
|   |   |   |           |   |-- abc_menu_hardkey_panel_mtrl_mult.9.png
|   |   |   |           |   |-- abc_popup_background_mtrl_mult.9.png
|   |   |   |           |   |-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |           |   |-- abc_switch_track_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_tab_indicator_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_textfield_activated_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_textfield_default_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_textfield_search_activated_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_textfield_search_default_mtrl_alpha.9.png
|   |   |   |           |   |-- left_arrow.png
|   |   |   |           |   `-- right_arrow.png
|   |   |   |           |-- drawable-xhdpi-v4
|   |   |   |           |   |-- abc_ab_share_pack_holo_dark.9.png
|   |   |   |           |   |-- abc_ab_share_pack_holo_light.9.png
|   |   |   |           |   |-- abc_btn_check_to_on_mtrl_000.png
|   |   |   |           |   |-- abc_btn_check_to_on_mtrl_015.png
|   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_000.png
|   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_015.png
|   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00001.9.png
|   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00012.9.png
|   |   |   |           |   |-- abc_cab_background_top_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |           |   |-- abc_ic_clear_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_commit_search_api_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_go_search_api_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_menu_moreoverflow_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_menu_paste_mtrl_am_alpha.png
|   |   |   |           |   |-- abc_ic_menu_selectall_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_menu_share_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_search_api_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_voice_search_api_mtrl_alpha.png
|   |   |   |           |   |-- abc_list_divider_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_list_focused_holo.9.png
|   |   |   |           |   |-- abc_list_longpressed_holo.9.png
|   |   |   |           |   |-- abc_list_pressed_holo_dark.9.png
|   |   |   |           |   |-- abc_list_pressed_holo_light.9.png
|   |   |   |           |   |-- abc_list_selector_disabled_holo_dark.9.png
|   |   |   |           |   |-- abc_list_selector_disabled_holo_light.9.png
|   |   |   |           |   |-- abc_menu_hardkey_panel_mtrl_mult.9.png
|   |   |   |           |   |-- abc_popup_background_mtrl_mult.9.png
|   |   |   |           |   |-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |           |   |-- abc_switch_track_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_tab_indicator_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_textfield_activated_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_textfield_default_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_textfield_search_activated_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_textfield_search_default_mtrl_alpha.9.png
|   |   |   |           |   |-- left_arrow.png
|   |   |   |           |   `-- right_arrow.png
|   |   |   |           |-- drawable-xxhdpi-v4
|   |   |   |           |   |-- abc_ab_share_pack_holo_dark.9.png
|   |   |   |           |   |-- abc_ab_share_pack_holo_light.9.png
|   |   |   |           |   |-- abc_btn_check_to_on_mtrl_000.png
|   |   |   |           |   |-- abc_btn_check_to_on_mtrl_015.png
|   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_000.png
|   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_015.png
|   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00001.9.png
|   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00012.9.png
|   |   |   |           |   |-- abc_cab_background_top_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |           |   |-- abc_ic_clear_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_commit_search_api_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_go_search_api_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_menu_moreoverflow_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_menu_paste_mtrl_am_alpha.png
|   |   |   |           |   |-- abc_ic_menu_selectall_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_menu_share_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_search_api_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_voice_search_api_mtrl_alpha.png
|   |   |   |           |   |-- abc_list_divider_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_list_focused_holo.9.png
|   |   |   |           |   |-- abc_list_longpressed_holo.9.png
|   |   |   |           |   |-- abc_list_pressed_holo_dark.9.png
|   |   |   |           |   |-- abc_list_pressed_holo_light.9.png
|   |   |   |           |   |-- abc_list_selector_disabled_holo_dark.9.png
|   |   |   |           |   |-- abc_list_selector_disabled_holo_light.9.png
|   |   |   |           |   |-- abc_menu_hardkey_panel_mtrl_mult.9.png
|   |   |   |           |   |-- abc_popup_background_mtrl_mult.9.png
|   |   |   |           |   |-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |           |   |-- abc_switch_track_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_tab_indicator_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_textfield_activated_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_textfield_default_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_textfield_search_activated_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_textfield_search_default_mtrl_alpha.9.png
|   |   |   |           |   |-- left_arrow.png
|   |   |   |           |   `-- right_arrow.png
|   |   |   |           |-- drawable-xxxhdpi-v4
|   |   |   |           |   |-- abc_btn_check_to_on_mtrl_000.png
|   |   |   |           |   |-- abc_btn_check_to_on_mtrl_015.png
|   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_000.png
|   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_015.png
|   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00001.9.png
|   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00012.9.png
|   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |           |   |-- abc_ic_clear_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_menu_moreoverflow_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_menu_paste_mtrl_am_alpha.png
|   |   |   |           |   |-- abc_ic_menu_selectall_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_search_api_mtrl_alpha.png
|   |   |   |           |   |-- abc_ic_voice_search_api_mtrl_alpha.png
|   |   |   |           |   |-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |           |   |-- abc_switch_track_mtrl_alpha.9.png
|   |   |   |           |   |-- abc_tab_indicator_mtrl_alpha.9.png
|   |   |   |           |   |-- left_arrow.png
|   |   |   |           |   `-- right_arrow.png
|   |   |   |           |-- layout
|   |   |   |           |   |-- abc_action_bar_title_item.xml
|   |   |   |           |   |-- abc_action_bar_up_container.xml
|   |   |   |           |   |-- abc_action_bar_view_list_nav_layout.xml
|   |   |   |           |   |-- abc_action_menu_item_layout.xml
|   |   |   |           |   |-- abc_action_menu_layout.xml
|   |   |   |           |   |-- abc_action_mode_bar.xml
|   |   |   |           |   |-- abc_action_mode_close_item_material.xml
|   |   |   |           |   |-- abc_activity_chooser_view.xml
|   |   |   |           |   |-- abc_activity_chooser_view_include.xml
|   |   |   |           |   |-- abc_activity_chooser_view_list_item.xml
|   |   |   |           |   |-- abc_expanded_menu_layout.xml
|   |   |   |           |   |-- abc_list_menu_item_checkbox.xml
|   |   |   |           |   |-- abc_list_menu_item_icon.xml
|   |   |   |           |   |-- abc_list_menu_item_layout.xml
|   |   |   |           |   |-- abc_list_menu_item_radio.xml
|   |   |   |           |   |-- abc_popup_menu_item_layout.xml
|   |   |   |           |   |-- abc_screen_content_include.xml
|   |   |   |           |   |-- abc_screen_simple.xml
|   |   |   |           |   |-- abc_screen_simple_overlay_action_mode.xml
|   |   |   |           |   |-- abc_screen_toolbar.xml
|   |   |   |           |   |-- abc_search_dropdown_item_icons_2line.xml
|   |   |   |           |   |-- abc_search_view.xml
|   |   |   |           |   |-- abc_simple_dropdown_hint.xml
|   |   |   |           |   |-- material_tab.xml
|   |   |   |           |   |-- material_tab_icon.xml
|   |   |   |           |   |-- support_simple_spinner_dropdown_item.xml
|   |   |   |           |   |-- tab.xml
|   |   |   |           |   `-- tab_icon.xml
|   |   |   |           |-- layout-v11
|   |   |   |           |   `-- abc_screen_content_include.xml
|   |   |   |           |-- values
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-af
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-am
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-ar
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-bg
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-bn-rBD
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-ca
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-cs
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-da
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-de
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-el
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-en-rGB
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-en-rIN
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-es
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-es-rUS
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-et-rEE
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-eu-rES
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-fa
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-fi
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-fr
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-fr-rCA
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-gl-rES
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-hi
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-hr
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-hu
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-hy-rAM
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-in
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-is-rIS
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-it
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-iw
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-ja
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-ka-rGE
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-kk-rKZ
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-km-rKH
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-kn-rIN
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-ko
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-ky-rKG
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-land
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-large-v4
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-lo-rLA
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-lt
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-lv
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-mk-rMK
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-ml-rIN
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-mn-rMN
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-mr-rIN
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-ms-rMY
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-my-rMM
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-nb
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-ne-rNP
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-nl
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-pl
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-port
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-pt
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-pt-rPT
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-ro
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-ru
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-si-rLK
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-sk
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-sl
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-sr
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-sv
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-sw
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-sw600dp-v13
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-ta-rIN
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-te-rIN
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-th
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-tl
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-tr
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-uk
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-ur-rPK
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-uz-rUZ
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-v11
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-v14
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-v17
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-v21
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-vi
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-w360dp-v13
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-w480dp-v13
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-w500dp-v13
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-w600dp-v13
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-w720dp-v13
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-xlarge-land-v4
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-xlarge-v4
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-zh-rCN
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-zh-rHK
|   |   |   |           |   `-- values.xml
|   |   |   |           |-- values-zh-rTW
|   |   |   |           |   `-- values.xml
|   |   |   |           `-- values-zu
|   |   |   |               `-- values.xml
|   |   |   |-- rs
|   |   |   |   |-- debug
|   |   |   |   |   |-- lib
|   |   |   |   |   `-- obj
|   |   |   |   `-- test
|   |   |   |       `-- debug
|   |   |   |           |-- lib
|   |   |   |           `-- obj
|   |   |   `-- symbols
|   |   |       `-- test
|   |   |           `-- debug
|   |   |               `-- R.txt
|   |   |-- outputs
|   |   |   `-- aar
|   |   |       `-- MaterialTabsModule-debug.aar
|   |   `-- tmp
|   |       |-- compileDebugJava
|   |       `-- packageDebugJar
|   |           `-- MANIFEST.MF
|   |-- build.gradle
|   |-- materialtabs.iml
|   |-- proguard-rules.pro
|   `-- src
|       `-- main
|           |-- AndroidManifest.xml
|           |-- java
|           |   `-- it
|           |       `-- neokree
|           |           `-- materialtabs
|           |               |-- MaterialTab.java
|           |               |-- MaterialTabHost.java
|           |               `-- MaterialTabListener.java
|           `-- res
|               |-- drawable-hdpi
|               |   |-- left_arrow.png
|               |   `-- right_arrow.png
|               |-- drawable-mdpi
|               |   |-- left_arrow.png
|               |   `-- right_arrow.png
|               |-- drawable-xhdpi
|               |   |-- left_arrow.png
|               |   `-- right_arrow.png
|               |-- drawable-xxhdpi
|               |   |-- left_arrow.png
|               |   `-- right_arrow.png
|               |-- drawable-xxxhdpi
|               |   |-- left_arrow.png
|               |   `-- right_arrow.png
|               |-- layout
|               |   |-- material_tab.xml
|               |   |-- material_tab_icon.xml
|               |   |-- tab.xml
|               |   `-- tab_icon.xml
|               |-- values
|               |   |-- attrs.xml
|               |   |-- bools.xml
|               |   `-- dimens.xml
|               `-- values-sw600dp
|                   |-- bools.xml
|                   `-- ids.xml
|-- README.md
|-- README.md~
|-- android-ui-master
|   |-- LICENSE
|   |-- android-ui-master.iml
|   |-- build
|   |   |-- generated
|   |   |   |-- res
|   |   |   |   |-- generated
|   |   |   |   |   `-- test
|   |   |   |   `-- rs
|   |   |   |       |-- debug
|   |   |   |       `-- test
|   |   |   |           `-- debug
|   |   |   `-- source
|   |   |       |-- aidl
|   |   |       |   |-- debug
|   |   |       |   `-- test
|   |   |       |       `-- debug
|   |   |       |-- buildConfig
|   |   |       |   |-- debug
|   |   |       |   |   `-- at
|   |   |       |   |       `-- markushi
|   |   |       |   |           `-- ui
|   |   |       |   |               `-- BuildConfig.java
|   |   |       |   `-- test
|   |   |       |       `-- debug
|   |   |       |           `-- at
|   |   |       |               `-- markushi
|   |   |       |                   `-- ui
|   |   |       |                       `-- test
|   |   |       |                           `-- BuildConfig.java
|   |   |       |-- r
|   |   |       |   |-- debug
|   |   |       |   |   `-- at
|   |   |       |   |       `-- markushi
|   |   |       |   |           `-- ui
|   |   |       |   |               `-- R.java
|   |   |       |   `-- test
|   |   |       |       `-- debug
|   |   |       |           `-- at
|   |   |       |               `-- markushi
|   |   |       |                   `-- ui
|   |   |       |                       |-- R.java
|   |   |       |                       `-- test
|   |   |       |                           `-- R.java
|   |   |       `-- rs
|   |   |           |-- debug
|   |   |           `-- test
|   |   |               `-- debug
|   |   |-- intermediates
|   |   |   |-- assets
|   |   |   |   `-- test
|   |   |   |       `-- debug
|   |   |   |-- bundles
|   |   |   |   `-- debug
|   |   |   |       |-- AndroidManifest.xml
|   |   |   |       |-- R.txt
|   |   |   |       |-- aidl
|   |   |   |       |-- assets
|   |   |   |       |-- classes.jar
|   |   |   |       `-- res
|   |   |   |           `-- values
|   |   |   |               `-- values.xml
|   |   |   |-- classes
|   |   |   |   `-- debug
|   |   |   |       `-- at
|   |   |   |           `-- markushi
|   |   |   |               `-- ui
|   |   |   |                   |-- ActionView$1.class
|   |   |   |                   |-- ActionView$SavedState$1.class
|   |   |   |                   |-- ActionView$SavedState.class
|   |   |   |                   |-- ActionView.class
|   |   |   |                   |-- BuildConfig.class
|   |   |   |                   |-- R$attr.class
|   |   |   |                   |-- R$id.class
|   |   |   |                   |-- R$integer.class
|   |   |   |                   |-- R$styleable.class
|   |   |   |                   |-- R.class
|   |   |   |                   |-- RevealColorView$1.class
|   |   |   |                   |-- RevealColorView$2.class
|   |   |   |                   |-- RevealColorView.class
|   |   |   |                   |-- action
|   |   |   |                   |   |-- Action$1.class
|   |   |   |                   |   |-- Action.class
|   |   |   |                   |   |-- BackAction.class
|   |   |   |                   |   |-- CloseAction.class
|   |   |   |                   |   |-- DrawerAction.class
|   |   |   |                   |   |-- LineSegment$1.class
|   |   |   |                   |   |-- LineSegment.class
|   |   |   |                   |   `-- PlusAction.class
|   |   |   |                   `-- util
|   |   |   |                       |-- BakedBezierInterpolator.class
|   |   |   |                       `-- UiHelper.class
|   |   |   |-- dependency-cache
|   |   |   |   `-- debug
|   |   |   |-- incremental
|   |   |   |   |-- aidl
|   |   |   |   |   |-- debug
|   |   |   |   |   |   `-- dependency.store
|   |   |   |   |   `-- test
|   |   |   |   |       `-- debug
|   |   |   |   |           `-- dependency.store
|   |   |   |   |-- mergeAssets
|   |   |   |   |   |-- debug
|   |   |   |   |   |   `-- merger.xml
|   |   |   |   |   `-- test
|   |   |   |   |       `-- debug
|   |   |   |   |           `-- merger.xml
|   |   |   |   |-- mergeResources
|   |   |   |   |   `-- test
|   |   |   |   |       `-- debug
|   |   |   |   |           `-- merger.xml
|   |   |   |   `-- packageResources
|   |   |   |       `-- debug
|   |   |   |           `-- merger.xml
|   |   |   |-- lint
|   |   |   |-- manifests
|   |   |   |   |-- test
|   |   |   |   |   `-- debug
|   |   |   |   |       `-- AndroidManifest.xml
|   |   |   |   `-- tmp
|   |   |   |       `-- manifestMerger292813138309348467.xml
|   |   |   |-- ndk
|   |   |   |   `-- debug
|   |   |   |       |-- lib
|   |   |   |       `-- obj
|   |   |   |-- res
|   |   |   |   |-- resources-debug-test.ap_
|   |   |   |   `-- test
|   |   |   |       `-- debug
|   |   |   |           `-- values
|   |   |   |               `-- values.xml
|   |   |   |-- rs
|   |   |   |   |-- debug
|   |   |   |   |   |-- lib
|   |   |   |   |   `-- obj
|   |   |   |   `-- test
|   |   |   |       `-- debug
|   |   |   |           |-- lib
|   |   |   |           `-- obj
|   |   |   `-- symbols
|   |   |       `-- test
|   |   |           `-- debug
|   |   |               `-- R.txt
|   |   |-- outputs
|   |   |   `-- aar
|   |   |       `-- android-ui-master-debug.aar
|   |   `-- tmp
|   |       |-- compileDebugJava
|   |       `-- packageDebugJar
|   |           `-- MANIFEST.MF
|   |-- build.gradle
|   |-- gradle.properties
|   |-- maven.gradle
|   `-- src
|       `-- main
|           |-- AndroidManifest.xml
|           |-- java
|           |   `-- at
|           |       `-- markushi
|           |           `-- ui
|           |               |-- ActionView.java
|           |               |-- RevealColorView.java
|           |               |-- action
|           |               |   |-- Action.java
|           |               |   |-- BackAction.java
|           |               |   |-- CloseAction.java
|           |               |   |-- DrawerAction.java
|           |               |   |-- LineSegment.java
|           |               |   `-- PlusAction.java
|           |               `-- util
|           |                   |-- BakedBezierInterpolator.java
|           |                   `-- UiHelper.java
|           `-- res
|               `-- values
|                   |-- attrs.xml
|                   `-- values.xml
|-- app
|   |-- app.iml
|   |-- build
|   |   |-- generated
|   |   |   |-- res
|   |   |   |   |-- generated
|   |   |   |   |   `-- test
|   |   |   |   `-- rs
|   |   |   |       |-- debug
|   |   |   |       `-- test
|   |   |   |           `-- debug
|   |   |   `-- source
|   |   |       |-- aidl
|   |   |       |   |-- debug
|   |   |       |   `-- test
|   |   |       |       `-- debug
|   |   |       |-- buildConfig
|   |   |       |   |-- debug
|   |   |       |   |   `-- book
|   |   |       |   |       `-- hookheart
|   |   |       |   |           `-- com
|   |   |       |   |               `-- com
|   |   |       |   |                   `-- BuildConfig.java
|   |   |       |   `-- test
|   |   |       |       `-- debug
|   |   |       |           `-- book
|   |   |       |               `-- hookheart
|   |   |       |                   `-- com
|   |   |       |                       `-- com
|   |   |       |                           `-- test
|   |   |       |                               `-- BuildConfig.java
|   |   |       |-- r
|   |   |       |   |-- debug
|   |   |       |   |   |-- android
|   |   |       |   |   |   `-- support
|   |   |       |   |   |       `-- v7
|   |   |       |   |   |           `-- appcompat
|   |   |       |   |   |               `-- R.java
|   |   |       |   |   |-- at
|   |   |       |   |   |   `-- markushi
|   |   |       |   |   |       `-- ui
|   |   |       |   |   |           `-- R.java
|   |   |       |   |   |-- book
|   |   |       |   |   |   `-- hookheart
|   |   |       |   |   |       `-- com
|   |   |       |   |   |           `-- com
|   |   |       |   |   |               `-- R.java
|   |   |       |   |   `-- it
|   |   |       |   |       `-- neokree
|   |   |       |   |           `-- materialtabs
|   |   |       |   |               `-- R.java
|   |   |       |   `-- test
|   |   |       |       `-- debug
|   |   |       `-- rs
|   |   |           |-- debug
|   |   |           `-- test
|   |   |               `-- debug
|   |   |-- intermediates
|   |   |   |-- assets
|   |   |   |   |-- debug
|   |   |   |   `-- test
|   |   |   |       `-- debug
|   |   |   |-- classes
|   |   |   |   `-- debug
|   |   |   |       |-- android
|   |   |   |       |   `-- support
|   |   |   |       |       `-- v7
|   |   |   |       |           `-- appcompat
|   |   |   |       |               |-- R$anim.class
|   |   |   |       |               |-- R$attr.class
|   |   |   |       |               |-- R$bool.class
|   |   |   |       |               |-- R$color.class
|   |   |   |       |               |-- R$dimen.class
|   |   |   |       |               |-- R$drawable.class
|   |   |   |       |               |-- R$id.class
|   |   |   |       |               |-- R$integer.class
|   |   |   |       |               |-- R$layout.class
|   |   |   |       |               |-- R$string.class
|   |   |   |       |               |-- R$style.class
|   |   |   |       |               |-- R$styleable.class
|   |   |   |       |               `-- R.class
|   |   |   |       |-- at
|   |   |   |       |   `-- markushi
|   |   |   |       |       `-- ui
|   |   |   |       |           |-- R$attr.class
|   |   |   |       |           |-- R$id.class
|   |   |   |       |           |-- R$integer.class
|   |   |   |       |           |-- R$styleable.class
|   |   |   |       |           `-- R.class
|   |   |   |       |-- book
|   |   |   |       |   `-- hookheart
|   |   |   |       |       `-- com
|   |   |   |       |           |-- book
|   |   |   |       |           `-- com
|   |   |   |       |               |-- BuildConfig.class
|   |   |   |       |               |-- MainTabActivity$1.class
|   |   |   |       |               |-- MainTabActivity$PlaceholderFragment.class
|   |   |   |       |               |-- MainTabActivity$ViewPagerAdapter.class
|   |   |   |       |               |-- MainTabActivity.class
|   |   |   |       |               |-- NavigationDrawerFragment$1.class
|   |   |   |       |               |-- NavigationDrawerFragment$2.class
|   |   |   |       |               |-- NavigationDrawerFragment$3.class
|   |   |   |       |               |-- NavigationDrawerFragment$NavigationDrawerCallbacks.class
|   |   |   |       |               |-- NavigationDrawerFragment.class
|   |   |   |       |               |-- R$anim.class
|   |   |   |       |               |-- R$attr.class
|   |   |   |       |               |-- R$bool.class
|   |   |   |       |               |-- R$color.class
|   |   |   |       |               |-- R$dimen.class
|   |   |   |       |               |-- R$drawable.class
|   |   |   |       |               |-- R$id.class
|   |   |   |       |               |-- R$integer.class
|   |   |   |       |               |-- R$layout.class
|   |   |   |       |               |-- R$menu.class
|   |   |   |       |               |-- R$mipmap.class
|   |   |   |       |               |-- R$string.class
|   |   |   |       |               |-- R$style.class
|   |   |   |       |               |-- R$styleable.class
|   |   |   |       |               `-- R.class
|   |   |   |       |-- com
|   |   |   |       |   `-- hookheart
|   |   |   |       |       `-- book
|   |   |   |       |           `-- fragment
|   |   |   |       |               `-- FragmentText.class
|   |   |   |       `-- it
|   |   |   |           `-- neokree
|   |   |   |               `-- materialtabs
|   |   |   |                   |-- R$anim.class
|   |   |   |                   |-- R$attr.class
|   |   |   |                   |-- R$bool.class
|   |   |   |                   |-- R$color.class
|   |   |   |                   |-- R$dimen.class
|   |   |   |                   |-- R$drawable.class
|   |   |   |                   |-- R$id.class
|   |   |   |                   |-- R$integer.class
|   |   |   |                   |-- R$layout.class
|   |   |   |                   |-- R$string.class
|   |   |   |                   |-- R$style.class
|   |   |   |                   |-- R$styleable.class
|   |   |   |                   `-- R.class
|   |   |   |-- dependency-cache
|   |   |   |   `-- debug
|   |   |   |-- dex
|   |   |   |   `-- debug
|   |   |   |       `-- classes.dex
|   |   |   |-- exploded-aar
|   |   |   |   |-- com.android.support
|   |   |   |   |   |-- appcompat-v7
|   |   |   |   |   |   `-- 21.0.3
|   |   |   |   |   |       |-- AndroidManifest.xml
|   |   |   |   |   |       |-- R.txt
|   |   |   |   |   |       |-- assets
|   |   |   |   |   |       |-- classes.jar
|   |   |   |   |   |       `-- res
|   |   |   |   |   |           |-- anim
|   |   |   |   |   |           |   |-- abc_fade_in.xml
|   |   |   |   |   |           |   |-- abc_fade_out.xml
|   |   |   |   |   |           |   |-- abc_slide_in_bottom.xml
|   |   |   |   |   |           |   |-- abc_slide_in_top.xml
|   |   |   |   |   |           |   |-- abc_slide_out_bottom.xml
|   |   |   |   |   |           |   `-- abc_slide_out_top.xml
|   |   |   |   |   |           |-- color
|   |   |   |   |   |           |   |-- abc_background_cache_hint_selector_material_dark.xml
|   |   |   |   |   |           |   |-- abc_background_cache_hint_selector_material_light.xml
|   |   |   |   |   |           |   |-- abc_primary_text_disable_only_material_dark.xml
|   |   |   |   |   |           |   |-- abc_primary_text_disable_only_material_light.xml
|   |   |   |   |   |           |   |-- abc_primary_text_material_dark.xml
|   |   |   |   |   |           |   |-- abc_primary_text_material_light.xml
|   |   |   |   |   |           |   |-- abc_search_url_text.xml
|   |   |   |   |   |           |   |-- abc_secondary_text_material_dark.xml
|   |   |   |   |   |           |   `-- abc_secondary_text_material_light.xml
|   |   |   |   |   |           |-- drawable
|   |   |   |   |   |           |   |-- abc_btn_check_material.xml
|   |   |   |   |   |           |   |-- abc_btn_radio_material.xml
|   |   |   |   |   |           |   |-- abc_cab_background_internal_bg.xml
|   |   |   |   |   |           |   |-- abc_cab_background_top_material.xml
|   |   |   |   |   |           |   |-- abc_edit_text_material.xml
|   |   |   |   |   |           |   |-- abc_item_background_holo_dark.xml
|   |   |   |   |   |           |   |-- abc_item_background_holo_light.xml
|   |   |   |   |   |           |   |-- abc_list_selector_background_transition_holo_dark.xml
|   |   |   |   |   |           |   |-- abc_list_selector_background_transition_holo_light.xml
|   |   |   |   |   |           |   |-- abc_list_selector_holo_dark.xml
|   |   |   |   |   |           |   |-- abc_list_selector_holo_light.xml
|   |   |   |   |   |           |   |-- abc_switch_thumb_material.xml
|   |   |   |   |   |           |   |-- abc_tab_indicator_material.xml
|   |   |   |   |   |           |   `-- abc_textfield_search_material.xml
|   |   |   |   |   |           |-- drawable-hdpi
|   |   |   |   |   |           |   |-- abc_ab_share_pack_holo_dark.9.png
|   |   |   |   |   |           |   |-- abc_ab_share_pack_holo_light.9.png
|   |   |   |   |   |           |   |-- abc_btn_check_to_on_mtrl_000.png
|   |   |   |   |   |           |   |-- abc_btn_check_to_on_mtrl_015.png
|   |   |   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_000.png
|   |   |   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_015.png
|   |   |   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00001.9.png
|   |   |   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00012.9.png
|   |   |   |   |   |           |   |-- abc_cab_background_top_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_clear_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_commit_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_go_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_moreoverflow_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_paste_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_selectall_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_share_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_voice_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_list_divider_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_list_focused_holo.9.png
|   |   |   |   |   |           |   |-- abc_list_longpressed_holo.9.png
|   |   |   |   |   |           |   |-- abc_list_pressed_holo_dark.9.png
|   |   |   |   |   |           |   |-- abc_list_pressed_holo_light.9.png
|   |   |   |   |   |           |   |-- abc_list_selector_disabled_holo_dark.9.png
|   |   |   |   |   |           |   |-- abc_list_selector_disabled_holo_light.9.png
|   |   |   |   |   |           |   |-- abc_menu_hardkey_panel_mtrl_mult.9.png
|   |   |   |   |   |           |   |-- abc_popup_background_mtrl_mult.9.png
|   |   |   |   |   |           |   |-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |           |   |-- abc_switch_track_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_tab_indicator_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_textfield_activated_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_textfield_default_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_textfield_search_activated_mtrl_alpha.9.png
|   |   |   |   |   |           |   `-- abc_textfield_search_default_mtrl_alpha.9.png
|   |   |   |   |   |           |-- drawable-ldrtl-hdpi
|   |   |   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |           |   `-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |           |-- drawable-ldrtl-mdpi
|   |   |   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |           |   `-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |           |-- drawable-ldrtl-xhdpi
|   |   |   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |           |   `-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |           |-- drawable-ldrtl-xxhdpi
|   |   |   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |           |   `-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |           |-- drawable-ldrtl-xxxhdpi
|   |   |   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |           |   `-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |           |-- drawable-mdpi
|   |   |   |   |   |           |   |-- abc_ab_share_pack_holo_dark.9.png
|   |   |   |   |   |           |   |-- abc_ab_share_pack_holo_light.9.png
|   |   |   |   |   |           |   |-- abc_btn_check_to_on_mtrl_000.png
|   |   |   |   |   |           |   |-- abc_btn_check_to_on_mtrl_015.png
|   |   |   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_000.png
|   |   |   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_015.png
|   |   |   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00001.9.png
|   |   |   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00012.9.png
|   |   |   |   |   |           |   |-- abc_cab_background_top_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_clear_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_commit_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_go_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_moreoverflow_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_paste_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_selectall_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_share_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_voice_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_list_divider_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_list_focused_holo.9.png
|   |   |   |   |   |           |   |-- abc_list_longpressed_holo.9.png
|   |   |   |   |   |           |   |-- abc_list_pressed_holo_dark.9.png
|   |   |   |   |   |           |   |-- abc_list_pressed_holo_light.9.png
|   |   |   |   |   |           |   |-- abc_list_selector_disabled_holo_dark.9.png
|   |   |   |   |   |           |   |-- abc_list_selector_disabled_holo_light.9.png
|   |   |   |   |   |           |   |-- abc_menu_hardkey_panel_mtrl_mult.9.png
|   |   |   |   |   |           |   |-- abc_popup_background_mtrl_mult.9.png
|   |   |   |   |   |           |   |-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |           |   |-- abc_switch_track_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_tab_indicator_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_textfield_activated_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_textfield_default_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_textfield_search_activated_mtrl_alpha.9.png
|   |   |   |   |   |           |   `-- abc_textfield_search_default_mtrl_alpha.9.png
|   |   |   |   |   |           |-- drawable-xhdpi
|   |   |   |   |   |           |   |-- abc_ab_share_pack_holo_dark.9.png
|   |   |   |   |   |           |   |-- abc_ab_share_pack_holo_light.9.png
|   |   |   |   |   |           |   |-- abc_btn_check_to_on_mtrl_000.png
|   |   |   |   |   |           |   |-- abc_btn_check_to_on_mtrl_015.png
|   |   |   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_000.png
|   |   |   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_015.png
|   |   |   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00001.9.png
|   |   |   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00012.9.png
|   |   |   |   |   |           |   |-- abc_cab_background_top_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_clear_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_commit_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_go_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_moreoverflow_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_paste_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_selectall_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_share_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_voice_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_list_divider_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_list_focused_holo.9.png
|   |   |   |   |   |           |   |-- abc_list_longpressed_holo.9.png
|   |   |   |   |   |           |   |-- abc_list_pressed_holo_dark.9.png
|   |   |   |   |   |           |   |-- abc_list_pressed_holo_light.9.png
|   |   |   |   |   |           |   |-- abc_list_selector_disabled_holo_dark.9.png
|   |   |   |   |   |           |   |-- abc_list_selector_disabled_holo_light.9.png
|   |   |   |   |   |           |   |-- abc_menu_hardkey_panel_mtrl_mult.9.png
|   |   |   |   |   |           |   |-- abc_popup_background_mtrl_mult.9.png
|   |   |   |   |   |           |   |-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |           |   |-- abc_switch_track_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_tab_indicator_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_textfield_activated_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_textfield_default_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_textfield_search_activated_mtrl_alpha.9.png
|   |   |   |   |   |           |   `-- abc_textfield_search_default_mtrl_alpha.9.png
|   |   |   |   |   |           |-- drawable-xxhdpi
|   |   |   |   |   |           |   |-- abc_ab_share_pack_holo_dark.9.png
|   |   |   |   |   |           |   |-- abc_ab_share_pack_holo_light.9.png
|   |   |   |   |   |           |   |-- abc_btn_check_to_on_mtrl_000.png
|   |   |   |   |   |           |   |-- abc_btn_check_to_on_mtrl_015.png
|   |   |   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_000.png
|   |   |   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_015.png
|   |   |   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00001.9.png
|   |   |   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00012.9.png
|   |   |   |   |   |           |   |-- abc_cab_background_top_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_clear_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_commit_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_go_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_moreoverflow_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_paste_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_selectall_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_share_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_voice_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_list_divider_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_list_focused_holo.9.png
|   |   |   |   |   |           |   |-- abc_list_longpressed_holo.9.png
|   |   |   |   |   |           |   |-- abc_list_pressed_holo_dark.9.png
|   |   |   |   |   |           |   |-- abc_list_pressed_holo_light.9.png
|   |   |   |   |   |           |   |-- abc_list_selector_disabled_holo_dark.9.png
|   |   |   |   |   |           |   |-- abc_list_selector_disabled_holo_light.9.png
|   |   |   |   |   |           |   |-- abc_menu_hardkey_panel_mtrl_mult.9.png
|   |   |   |   |   |           |   |-- abc_popup_background_mtrl_mult.9.png
|   |   |   |   |   |           |   |-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |           |   |-- abc_switch_track_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_tab_indicator_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_textfield_activated_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_textfield_default_mtrl_alpha.9.png
|   |   |   |   |   |           |   |-- abc_textfield_search_activated_mtrl_alpha.9.png
|   |   |   |   |   |           |   `-- abc_textfield_search_default_mtrl_alpha.9.png
|   |   |   |   |   |           |-- drawable-xxxhdpi
|   |   |   |   |   |           |   |-- abc_btn_check_to_on_mtrl_000.png
|   |   |   |   |   |           |   |-- abc_btn_check_to_on_mtrl_015.png
|   |   |   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_000.png
|   |   |   |   |   |           |   |-- abc_btn_radio_to_on_mtrl_015.png
|   |   |   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00001.9.png
|   |   |   |   |   |           |   |-- abc_btn_switch_to_on_mtrl_00012.9.png
|   |   |   |   |   |           |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_clear_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_moreoverflow_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_paste_mtrl_am_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_menu_selectall_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_ic_voice_search_api_mtrl_alpha.png
|   |   |   |   |   |           |   |-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |           |   |-- abc_switch_track_mtrl_alpha.9.png
|   |   |   |   |   |           |   `-- abc_tab_indicator_mtrl_alpha.9.png
|   |   |   |   |   |           |-- layout
|   |   |   |   |   |           |   |-- abc_action_bar_title_item.xml
|   |   |   |   |   |           |   |-- abc_action_bar_up_container.xml
|   |   |   |   |   |           |   |-- abc_action_bar_view_list_nav_layout.xml
|   |   |   |   |   |           |   |-- abc_action_menu_item_layout.xml
|   |   |   |   |   |           |   |-- abc_action_menu_layout.xml
|   |   |   |   |   |           |   |-- abc_action_mode_bar.xml
|   |   |   |   |   |           |   |-- abc_action_mode_close_item_material.xml
|   |   |   |   |   |           |   |-- abc_activity_chooser_view.xml
|   |   |   |   |   |           |   |-- abc_activity_chooser_view_include.xml
|   |   |   |   |   |           |   |-- abc_activity_chooser_view_list_item.xml
|   |   |   |   |   |           |   |-- abc_expanded_menu_layout.xml
|   |   |   |   |   |           |   |-- abc_list_menu_item_checkbox.xml
|   |   |   |   |   |           |   |-- abc_list_menu_item_icon.xml
|   |   |   |   |   |           |   |-- abc_list_menu_item_layout.xml
|   |   |   |   |   |           |   |-- abc_list_menu_item_radio.xml
|   |   |   |   |   |           |   |-- abc_popup_menu_item_layout.xml
|   |   |   |   |   |           |   |-- abc_screen_content_include.xml
|   |   |   |   |   |           |   |-- abc_screen_simple.xml
|   |   |   |   |   |           |   |-- abc_screen_simple_overlay_action_mode.xml
|   |   |   |   |   |           |   |-- abc_screen_toolbar.xml
|   |   |   |   |   |           |   |-- abc_search_dropdown_item_icons_2line.xml
|   |   |   |   |   |           |   |-- abc_search_view.xml
|   |   |   |   |   |           |   |-- abc_simple_dropdown_hint.xml
|   |   |   |   |   |           |   `-- support_simple_spinner_dropdown_item.xml
|   |   |   |   |   |           |-- layout-v11
|   |   |   |   |   |           |   `-- abc_screen_content_include.xml
|   |   |   |   |   |           |-- values
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-af
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-am
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-ar
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-bg
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-bn-rBD
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-ca
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-cs
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-da
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-de
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-el
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-en-rGB
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-en-rIN
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-es
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-es-rUS
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-et-rEE
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-eu-rES
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-fa
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-fi
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-fr
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-fr-rCA
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-gl-rES
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-hi
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-hr
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-hu
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-hy-rAM
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-in
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-is-rIS
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-it
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-iw
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-ja
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-ka-rGE
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-kk-rKZ
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-km-rKH
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-kn-rIN
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-ko
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-ky-rKG
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-land
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-large
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-lo-rLA
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-lt
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-lv
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-mk-rMK
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-ml-rIN
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-mn-rMN
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-mr-rIN
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-ms-rMY
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-my-rMM
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-nb
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-ne-rNP
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-nl
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-pl
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-port
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-pt
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-pt-rPT
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-ro
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-ru
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-si-rLK
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-sk
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-sl
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-sr
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-sv
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-sw
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-sw600dp
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-ta-rIN
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-te-rIN
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-th
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-tl
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-tr
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-uk
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-ur-rPK
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-uz-rUZ
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-v11
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-v14
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-v17
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-v21
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-vi
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-w360dp
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-w480dp
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-w500dp
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-w600dp
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-w720dp
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-xlarge
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-xlarge-land
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-zh-rCN
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-zh-rHK
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           |-- values-zh-rTW
|   |   |   |   |   |           |   `-- values.xml
|   |   |   |   |   |           `-- values-zu
|   |   |   |   |   |               `-- values.xml
|   |   |   |   |   `-- support-v4
|   |   |   |   |       `-- 21.0.3
|   |   |   |   |           |-- AndroidManifest.xml
|   |   |   |   |           |-- aidl
|   |   |   |   |           |   `-- android
|   |   |   |   |           |       `-- support
|   |   |   |   |           |           `-- v4
|   |   |   |   |           |               |-- accessibilityservice
|   |   |   |   |           |               |-- app
|   |   |   |   |           |               |   `-- INotificationSideChannel.aidl
|   |   |   |   |           |               |-- content
|   |   |   |   |           |               |   |-- pm
|   |   |   |   |           |               |   `-- res
|   |   |   |   |           |               |-- database
|   |   |   |   |           |               |-- graphics
|   |   |   |   |           |               |   `-- drawable
|   |   |   |   |           |               |-- hardware
|   |   |   |   |           |               |   `-- display
|   |   |   |   |           |               |-- internal
|   |   |   |   |           |               |   `-- view
|   |   |   |   |           |               |-- media
|   |   |   |   |           |               |   `-- session
|   |   |   |   |           |               |-- net
|   |   |   |   |           |               |-- os
|   |   |   |   |           |               |-- print
|   |   |   |   |           |               |-- provider
|   |   |   |   |           |               |-- text
|   |   |   |   |           |               |-- util
|   |   |   |   |           |               |-- view
|   |   |   |   |           |               |   `-- accessibility
|   |   |   |   |           |               `-- widget
|   |   |   |   |           |-- assets
|   |   |   |   |           |-- classes.jar
|   |   |   |   |           |-- libs
|   |   |   |   |           |   `-- internal_impl-21.0.3.jar
|   |   |   |   |           `-- res
|   |   |   |   |-- com.github.markushi
|   |   |   |   |   `-- android-ui
|   |   |   |   |       `-- 1.2
|   |   |   |   |           |-- AndroidManifest.xml
|   |   |   |   |           |-- R.txt
|   |   |   |   |           |-- aidl
|   |   |   |   |           |-- assets
|   |   |   |   |           |-- classes.jar
|   |   |   |   |           `-- res
|   |   |   |   |               `-- values
|   |   |   |   |                   `-- values.xml
|   |   |   |   `-- it.neokree
|   |   |   |       `-- MaterialTabs
|   |   |   |           `-- 0.11
|   |   |   |               |-- AndroidManifest.xml
|   |   |   |               |-- R.txt
|   |   |   |               |-- aidl
|   |   |   |               |-- assets
|   |   |   |               |-- classes.jar
|   |   |   |               `-- res
|   |   |   |                   |-- drawable-hdpi-v4
|   |   |   |                   |   |-- left_arrow.png
|   |   |   |                   |   `-- right_arrow.png
|   |   |   |                   |-- drawable-mdpi-v4
|   |   |   |                   |   |-- left_arrow.png
|   |   |   |                   |   `-- right_arrow.png
|   |   |   |                   |-- drawable-xhdpi-v4
|   |   |   |                   |   |-- left_arrow.png
|   |   |   |                   |   `-- right_arrow.png
|   |   |   |                   |-- drawable-xxhdpi-v4
|   |   |   |                   |   |-- left_arrow.png
|   |   |   |                   |   `-- right_arrow.png
|   |   |   |                   |-- drawable-xxxhdpi-v4
|   |   |   |                   |   |-- left_arrow.png
|   |   |   |                   |   `-- right_arrow.png
|   |   |   |                   |-- layout
|   |   |   |                   |   |-- material_tab.xml
|   |   |   |                   |   |-- material_tab_icon.xml
|   |   |   |                   |   |-- tab.xml
|   |   |   |                   |   `-- tab_icon.xml
|   |   |   |                   |-- values
|   |   |   |                   |   `-- values.xml
|   |   |   |                   `-- values-sw600dp-v13
|   |   |   |                       `-- values.xml
|   |   |   |-- incremental
|   |   |   |   |-- aidl
|   |   |   |   |   |-- debug
|   |   |   |   |   |   `-- dependency.store
|   |   |   |   |   `-- test
|   |   |   |   |       `-- debug
|   |   |   |   |           `-- dependency.store
|   |   |   |   |-- mergeAssets
|   |   |   |   |   |-- debug
|   |   |   |   |   |   `-- merger.xml
|   |   |   |   |   `-- test
|   |   |   |   |       `-- debug
|   |   |   |   |           `-- merger.xml
|   |   |   |   `-- mergeResources
|   |   |   |       |-- debug
|   |   |   |       |   `-- merger.xml
|   |   |   |       `-- test
|   |   |   |           `-- debug
|   |   |   |               `-- merger.xml
|   |   |   |-- manifests
|   |   |   |   |-- full
|   |   |   |   |   `-- debug
|   |   |   |   |       `-- AndroidManifest.xml
|   |   |   |   |-- test
|   |   |   |   |   `-- debug
|   |   |   |   |       `-- AndroidManifest.xml
|   |   |   |   `-- tmp
|   |   |   |-- ndk
|   |   |   |   `-- debug
|   |   |   |       |-- lib
|   |   |   |       `-- obj
|   |   |   |-- pre-dexed
|   |   |   |   `-- debug
|   |   |   |       |-- classes-03ba2133b33ec731a293cc773297681ac2c3574c.jar
|   |   |   |       |-- classes-764715e0bb239cfec2f741a73f2beec694cb58ba.jar
|   |   |   |       |-- classes-e6082538823318c31210c78957f5814a95e49f23.jar
|   |   |   |       |-- classes-eefaee91e3f41a9df67778915862d31f5fb661c6.jar
|   |   |   |       |-- internal_impl-21.0.3-3d29245c0749ac65785055f99e833ebea9e63b42.jar
|   |   |   |       `-- support-annotations-21.0.3-cd85ba606e396b59b428e7cc64382f0cde9a8a27.jar
|   |   |   |-- res
|   |   |   |   |-- debug
|   |   |   |   |   |-- anim
|   |   |   |   |   |   |-- abc_fade_in.xml
|   |   |   |   |   |   |-- abc_fade_out.xml
|   |   |   |   |   |   |-- abc_slide_in_bottom.xml
|   |   |   |   |   |   |-- abc_slide_in_top.xml
|   |   |   |   |   |   |-- abc_slide_out_bottom.xml
|   |   |   |   |   |   `-- abc_slide_out_top.xml
|   |   |   |   |   |-- color
|   |   |   |   |   |   |-- abc_background_cache_hint_selector_material_dark.xml
|   |   |   |   |   |   |-- abc_background_cache_hint_selector_material_light.xml
|   |   |   |   |   |   |-- abc_primary_text_disable_only_material_dark.xml
|   |   |   |   |   |   |-- abc_primary_text_disable_only_material_light.xml
|   |   |   |   |   |   |-- abc_primary_text_material_dark.xml
|   |   |   |   |   |   |-- abc_primary_text_material_light.xml
|   |   |   |   |   |   |-- abc_search_url_text.xml
|   |   |   |   |   |   |-- abc_secondary_text_material_dark.xml
|   |   |   |   |   |   `-- abc_secondary_text_material_light.xml
|   |   |   |   |   |-- drawable
|   |   |   |   |   |   |-- abc_btn_check_material.xml
|   |   |   |   |   |   |-- abc_btn_radio_material.xml
|   |   |   |   |   |   |-- abc_cab_background_internal_bg.xml
|   |   |   |   |   |   |-- abc_cab_background_top_material.xml
|   |   |   |   |   |   |-- abc_edit_text_material.xml
|   |   |   |   |   |   |-- abc_item_background_holo_dark.xml
|   |   |   |   |   |   |-- abc_item_background_holo_light.xml
|   |   |   |   |   |   |-- abc_list_selector_background_transition_holo_dark.xml
|   |   |   |   |   |   |-- abc_list_selector_background_transition_holo_light.xml
|   |   |   |   |   |   |-- abc_list_selector_holo_dark.xml
|   |   |   |   |   |   |-- abc_list_selector_holo_light.xml
|   |   |   |   |   |   |-- abc_switch_thumb_material.xml
|   |   |   |   |   |   |-- abc_tab_indicator_material.xml
|   |   |   |   |   |   `-- abc_textfield_search_material.xml
|   |   |   |   |   |-- drawable-hdpi-v4
|   |   |   |   |   |   |-- abc_ab_share_pack_holo_dark.9.png
|   |   |   |   |   |   |-- abc_ab_share_pack_holo_light.9.png
|   |   |   |   |   |   |-- abc_btn_check_to_on_mtrl_000.png
|   |   |   |   |   |   |-- abc_btn_check_to_on_mtrl_015.png
|   |   |   |   |   |   |-- abc_btn_radio_to_on_mtrl_000.png
|   |   |   |   |   |   |-- abc_btn_radio_to_on_mtrl_015.png
|   |   |   |   |   |   |-- abc_btn_switch_to_on_mtrl_00001.9.png
|   |   |   |   |   |   |-- abc_btn_switch_to_on_mtrl_00012.9.png
|   |   |   |   |   |   |-- abc_cab_background_top_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_clear_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_commit_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_go_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_moreoverflow_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_paste_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_selectall_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_share_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_voice_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_list_divider_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_list_focused_holo.9.png
|   |   |   |   |   |   |-- abc_list_longpressed_holo.9.png
|   |   |   |   |   |   |-- abc_list_pressed_holo_dark.9.png
|   |   |   |   |   |   |-- abc_list_pressed_holo_light.9.png
|   |   |   |   |   |   |-- abc_list_selector_disabled_holo_dark.9.png
|   |   |   |   |   |   |-- abc_list_selector_disabled_holo_light.9.png
|   |   |   |   |   |   |-- abc_menu_hardkey_panel_mtrl_mult.9.png
|   |   |   |   |   |   |-- abc_popup_background_mtrl_mult.9.png
|   |   |   |   |   |   |-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |   |-- abc_switch_track_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_tab_indicator_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_activated_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_default_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_search_activated_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_search_default_mtrl_alpha.9.png
|   |   |   |   |   |   |-- drawer_shadow.9.png
|   |   |   |   |   |   |-- ic_drawer.png
|   |   |   |   |   |   |-- left_arrow.png
|   |   |   |   |   |   `-- right_arrow.png
|   |   |   |   |   |-- drawable-ldrtl-hdpi-v17
|   |   |   |   |   |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |   `-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |-- drawable-ldrtl-mdpi-v17
|   |   |   |   |   |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |   `-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |-- drawable-ldrtl-xhdpi-v17
|   |   |   |   |   |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |   `-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |-- drawable-ldrtl-xxhdpi-v17
|   |   |   |   |   |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |   `-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |-- drawable-ldrtl-xxxhdpi-v17
|   |   |   |   |   |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |   `-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |-- drawable-mdpi-v4
|   |   |   |   |   |   |-- abc_ab_share_pack_holo_dark.9.png
|   |   |   |   |   |   |-- abc_ab_share_pack_holo_light.9.png
|   |   |   |   |   |   |-- abc_btn_check_to_on_mtrl_000.png
|   |   |   |   |   |   |-- abc_btn_check_to_on_mtrl_015.png
|   |   |   |   |   |   |-- abc_btn_radio_to_on_mtrl_000.png
|   |   |   |   |   |   |-- abc_btn_radio_to_on_mtrl_015.png
|   |   |   |   |   |   |-- abc_btn_switch_to_on_mtrl_00001.9.png
|   |   |   |   |   |   |-- abc_btn_switch_to_on_mtrl_00012.9.png
|   |   |   |   |   |   |-- abc_cab_background_top_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_clear_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_commit_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_go_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_moreoverflow_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_paste_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_selectall_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_share_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_voice_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_list_divider_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_list_focused_holo.9.png
|   |   |   |   |   |   |-- abc_list_longpressed_holo.9.png
|   |   |   |   |   |   |-- abc_list_pressed_holo_dark.9.png
|   |   |   |   |   |   |-- abc_list_pressed_holo_light.9.png
|   |   |   |   |   |   |-- abc_list_selector_disabled_holo_dark.9.png
|   |   |   |   |   |   |-- abc_list_selector_disabled_holo_light.9.png
|   |   |   |   |   |   |-- abc_menu_hardkey_panel_mtrl_mult.9.png
|   |   |   |   |   |   |-- abc_popup_background_mtrl_mult.9.png
|   |   |   |   |   |   |-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |   |-- abc_switch_track_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_tab_indicator_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_activated_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_default_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_search_activated_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_search_default_mtrl_alpha.9.png
|   |   |   |   |   |   |-- drawer_shadow.9.png
|   |   |   |   |   |   |-- ic_drawer.png
|   |   |   |   |   |   |-- left_arrow.png
|   |   |   |   |   |   `-- right_arrow.png
|   |   |   |   |   |-- drawable-xhdpi-v4
|   |   |   |   |   |   |-- abc_ab_share_pack_holo_dark.9.png
|   |   |   |   |   |   |-- abc_ab_share_pack_holo_light.9.png
|   |   |   |   |   |   |-- abc_btn_check_to_on_mtrl_000.png
|   |   |   |   |   |   |-- abc_btn_check_to_on_mtrl_015.png
|   |   |   |   |   |   |-- abc_btn_radio_to_on_mtrl_000.png
|   |   |   |   |   |   |-- abc_btn_radio_to_on_mtrl_015.png
|   |   |   |   |   |   |-- abc_btn_switch_to_on_mtrl_00001.9.png
|   |   |   |   |   |   |-- abc_btn_switch_to_on_mtrl_00012.9.png
|   |   |   |   |   |   |-- abc_cab_background_top_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_clear_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_commit_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_go_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_moreoverflow_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_paste_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_selectall_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_share_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_voice_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_list_divider_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_list_focused_holo.9.png
|   |   |   |   |   |   |-- abc_list_longpressed_holo.9.png
|   |   |   |   |   |   |-- abc_list_pressed_holo_dark.9.png
|   |   |   |   |   |   |-- abc_list_pressed_holo_light.9.png
|   |   |   |   |   |   |-- abc_list_selector_disabled_holo_dark.9.png
|   |   |   |   |   |   |-- abc_list_selector_disabled_holo_light.9.png
|   |   |   |   |   |   |-- abc_menu_hardkey_panel_mtrl_mult.9.png
|   |   |   |   |   |   |-- abc_popup_background_mtrl_mult.9.png
|   |   |   |   |   |   |-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |   |-- abc_switch_track_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_tab_indicator_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_activated_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_default_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_search_activated_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_search_default_mtrl_alpha.9.png
|   |   |   |   |   |   |-- drawer_shadow.9.png
|   |   |   |   |   |   |-- ic_drawer.png
|   |   |   |   |   |   |-- left_arrow.png
|   |   |   |   |   |   `-- right_arrow.png
|   |   |   |   |   |-- drawable-xxhdpi-v4
|   |   |   |   |   |   |-- abc_ab_share_pack_holo_dark.9.png
|   |   |   |   |   |   |-- abc_ab_share_pack_holo_light.9.png
|   |   |   |   |   |   |-- abc_btn_check_to_on_mtrl_000.png
|   |   |   |   |   |   |-- abc_btn_check_to_on_mtrl_015.png
|   |   |   |   |   |   |-- abc_btn_radio_to_on_mtrl_000.png
|   |   |   |   |   |   |-- abc_btn_radio_to_on_mtrl_015.png
|   |   |   |   |   |   |-- abc_btn_switch_to_on_mtrl_00001.9.png
|   |   |   |   |   |   |-- abc_btn_switch_to_on_mtrl_00012.9.png
|   |   |   |   |   |   |-- abc_cab_background_top_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_clear_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_commit_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_go_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_moreoverflow_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_paste_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_selectall_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_share_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_voice_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_list_divider_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_list_focused_holo.9.png
|   |   |   |   |   |   |-- abc_list_longpressed_holo.9.png
|   |   |   |   |   |   |-- abc_list_pressed_holo_dark.9.png
|   |   |   |   |   |   |-- abc_list_pressed_holo_light.9.png
|   |   |   |   |   |   |-- abc_list_selector_disabled_holo_dark.9.png
|   |   |   |   |   |   |-- abc_list_selector_disabled_holo_light.9.png
|   |   |   |   |   |   |-- abc_menu_hardkey_panel_mtrl_mult.9.png
|   |   |   |   |   |   |-- abc_popup_background_mtrl_mult.9.png
|   |   |   |   |   |   |-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |   |-- abc_switch_track_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_tab_indicator_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_activated_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_default_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_search_activated_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_textfield_search_default_mtrl_alpha.9.png
|   |   |   |   |   |   |-- drawer_shadow.9.png
|   |   |   |   |   |   |-- ic_drawer.png
|   |   |   |   |   |   |-- left_arrow.png
|   |   |   |   |   |   `-- right_arrow.png
|   |   |   |   |   |-- drawable-xxxhdpi-v4
|   |   |   |   |   |   |-- abc_btn_check_to_on_mtrl_000.png
|   |   |   |   |   |   |-- abc_btn_check_to_on_mtrl_015.png
|   |   |   |   |   |   |-- abc_btn_radio_to_on_mtrl_000.png
|   |   |   |   |   |   |-- abc_btn_radio_to_on_mtrl_015.png
|   |   |   |   |   |   |-- abc_btn_switch_to_on_mtrl_00001.9.png
|   |   |   |   |   |   |-- abc_btn_switch_to_on_mtrl_00012.9.png
|   |   |   |   |   |   |-- abc_ic_ab_back_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_clear_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_copy_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_cut_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_moreoverflow_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_paste_mtrl_am_alpha.png
|   |   |   |   |   |   |-- abc_ic_menu_selectall_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_ic_voice_search_api_mtrl_alpha.png
|   |   |   |   |   |   |-- abc_spinner_mtrl_am_alpha.9.png
|   |   |   |   |   |   |-- abc_switch_track_mtrl_alpha.9.png
|   |   |   |   |   |   |-- abc_tab_indicator_mtrl_alpha.9.png
|   |   |   |   |   |   |-- left_arrow.png
|   |   |   |   |   |   `-- right_arrow.png
|   |   |   |   |   |-- layout
|   |   |   |   |   |   |-- abc_action_bar_title_item.xml
|   |   |   |   |   |   |-- abc_action_bar_up_container.xml
|   |   |   |   |   |   |-- abc_action_bar_view_list_nav_layout.xml
|   |   |   |   |   |   |-- abc_action_menu_item_layout.xml
|   |   |   |   |   |   |-- abc_action_menu_layout.xml
|   |   |   |   |   |   |-- abc_action_mode_bar.xml
|   |   |   |   |   |   |-- abc_action_mode_close_item_material.xml
|   |   |   |   |   |   |-- abc_activity_chooser_view.xml
|   |   |   |   |   |   |-- abc_activity_chooser_view_include.xml
|   |   |   |   |   |   |-- abc_activity_chooser_view_list_item.xml
|   |   |   |   |   |   |-- abc_expanded_menu_layout.xml
|   |   |   |   |   |   |-- abc_list_menu_item_checkbox.xml
|   |   |   |   |   |   |-- abc_list_menu_item_icon.xml
|   |   |   |   |   |   |-- abc_list_menu_item_layout.xml
|   |   |   |   |   |   |-- abc_list_menu_item_radio.xml
|   |   |   |   |   |   |-- abc_popup_menu_item_layout.xml
|   |   |   |   |   |   |-- abc_screen_content_include.xml
|   |   |   |   |   |   |-- abc_screen_simple.xml
|   |   |   |   |   |   |-- abc_screen_simple_overlay_action_mode.xml
|   |   |   |   |   |   |-- abc_screen_toolbar.xml
|   |   |   |   |   |   |-- abc_search_dropdown_item_icons_2line.xml
|   |   |   |   |   |   |-- abc_search_view.xml
|   |   |   |   |   |   |-- abc_simple_dropdown_hint.xml
|   |   |   |   |   |   |-- activity_main_tab.xml
|   |   |   |   |   |   |-- fragment_main_tab.xml
|   |   |   |   |   |   |-- fragment_navigation_drawer.xml
|   |   |   |   |   |   |-- material_tab.xml
|   |   |   |   |   |   |-- material_tab_icon.xml
|   |   |   |   |   |   |-- support_simple_spinner_dropdown_item.xml
|   |   |   |   |   |   |-- tab.xml
|   |   |   |   |   |   `-- tab_icon.xml
|   |   |   |   |   |-- layout-v11
|   |   |   |   |   |   `-- abc_screen_content_include.xml
|   |   |   |   |   |-- menu
|   |   |   |   |   |   |-- global.xml
|   |   |   |   |   |   `-- main_tab.xml
|   |   |   |   |   |-- mipmap-hdpi-v4
|   |   |   |   |   |   `-- ic_launcher.png
|   |   |   |   |   |-- mipmap-mdpi-v4
|   |   |   |   |   |   `-- ic_launcher.png
|   |   |   |   |   |-- mipmap-xhdpi-v4
|   |   |   |   |   |   `-- ic_launcher.png
|   |   |   |   |   |-- mipmap-xxhdpi-v4
|   |   |   |   |   |   `-- ic_launcher.png
|   |   |   |   |   |-- values
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-af
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-am
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-ar
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-bg
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-bn-rBD
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-ca
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-cs
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-da
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-de
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-el
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-en-rGB
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-en-rIN
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-es
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-es-rUS
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-et-rEE
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-eu-rES
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-fa
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-fi
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-fr
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-fr-rCA
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-gl-rES
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-hi
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-hr
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-hu
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-hy-rAM
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-in
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-is-rIS
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-it
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-iw
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-ja
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-ka-rGE
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-kk-rKZ
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-km-rKH
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-kn-rIN
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-ko
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-ky-rKG
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-land
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-large-v4
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-lo-rLA
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-lt
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-lv
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-mk-rMK
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-ml-rIN
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-mn-rMN
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-mr-rIN
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-ms-rMY
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-my-rMM
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-nb
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-ne-rNP
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-nl
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-pl
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-port
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-pt
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-pt-rPT
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-ro
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-ru
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-si-rLK
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-sk
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-sl
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-sr
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-sv
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-sw
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-sw600dp-v13
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-ta-rIN
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-te-rIN
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-th
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-tl
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-tr
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-uk
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-ur-rPK
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-uz-rUZ
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-v11
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-v14
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-v17
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-v21
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-vi
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-w360dp-v13
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-w480dp-v13
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-w500dp-v13
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-w600dp-v13
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-w720dp-v13
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-w820dp-v13
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-xlarge-land-v4
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-xlarge-v4
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-zh-rCN
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-zh-rHK
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   |-- values-zh-rTW
|   |   |   |   |   |   `-- values.xml
|   |   |   |   |   `-- values-zu
|   |   |   |   |       `-- values.xml
|   |   |   |   |-- resources-debug-test.ap_
|   |   |   |   |-- resources-debug.ap_
|   |   |   |   `-- test
|   |   |   |       `-- debug
|   |   |   |-- rs
|   |   |   |   |-- debug
|   |   |   |   |   |-- lib
|   |   |   |   |   `-- obj
|   |   |   |   `-- test
|   |   |   |       `-- debug
|   |   |   |           |-- lib
|   |   |   |           `-- obj
|   |   |   |-- symbols
|   |   |   |   |-- debug
|   |   |   |   |   `-- R.txt
|   |   |   |   `-- test
|   |   |   |       `-- debug
|   |   |   `-- tmp
|   |   |       `-- dex
|   |   |           `-- debug
|   |   |               `-- inputList.txt
|   |   |-- outputs
|   |   |   `-- apk
|   |   |       |-- app-debug-unaligned.apk
|   |   |       |-- app-debug.apk
|   |   |       `-- manifest-merger-debug-report.txt
|   |   `-- tmp
|   |       `-- compileDebugJava
|   |-- build.gradle
|   |-- libs
|   |-- proguard-rules.pro
|   `-- src
|       |-- androidTest
|       |   `-- java
|       |       `-- book
|       |           `-- hookheart
|       |               `-- com
|       |                   `-- com
|       |                       `-- ApplicationTest.java
|       `-- main
|           |-- AndroidManifest.xml
|           |-- java
|           |   |-- book
|           |   |   `-- hookheart
|           |   |       `-- com
|           |   |           `-- com
|           |   |               |-- MainTabActivity.java
|           |   |               `-- NavigationDrawerFragment.java
|           |   `-- com
|           |       `-- hookheart
|           |           `-- book
|           |               `-- fragment
|           |                   `-- MyBooksFragment.java
|           `-- res
|               |-- drawable
|               |-- drawable-hdpi
|               |   |-- drawer_shadow.9.png
|               |   `-- ic_drawer.png
|               |-- drawable-mdpi
|               |   |-- drawer_shadow.9.png
|               |   `-- ic_drawer.png
|               |-- drawable-xhdpi
|               |   |-- drawer_shadow.9.png
|               |   `-- ic_drawer.png
|               |-- drawable-xxhdpi
|               |   |-- drawer_shadow.9.png
|               |   `-- ic_drawer.png
|               |-- layout
|               |   |-- activity_main_tab.xml
|               |   |-- fragment_main_tab.xml
|               |   `-- fragment_navigation_drawer.xml
|               |-- menu
|               |   |-- global.xml
|               |   `-- main_tab.xml
|               |-- mipmap-hdpi
|               |   `-- ic_launcher.png
|               |-- mipmap-mdpi
|               |   `-- ic_launcher.png
|               |-- mipmap-xhdpi
|               |   `-- ic_launcher.png
|               |-- mipmap-xxhdpi
|               |   `-- ic_launcher.png
|               |-- values
|               |   |-- color.xml
|               |   |-- dimens.xml
|               |   |-- strings.xml
|               |   `-- styles.xml
|               `-- values-w820dp
|                   `-- dimens.xml
|-- build
|   `-- intermediates
|       |-- dex-cache
|       |   `-- cache.xml
|       `-- model_data.bin
|-- build.gradle
|-- gradle
|   `-- wrapper
|       |-- gradle-wrapper.jar
|       `-- gradle-wrapper.properties
|-- gradle.properties
|-- gradlew
|-- gradlew.bat
|-- hs_err_pid13969.log
|-- local.properties
|-- picshot
|-- settings.gradle
`-- tree.md

1037 directories, 2018 files
