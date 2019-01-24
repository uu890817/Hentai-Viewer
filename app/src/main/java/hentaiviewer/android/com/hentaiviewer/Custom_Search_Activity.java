package hentaiviewer.android.com.hentaiviewer;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Custom_Search_Activity extends AppCompatActivity {

    TextView web_url;
    String rdogrp_use,button_use,tag_use;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_search);

        web_url = findViewById(R.id.web_url);
        final TextView tag_input = findViewById(R.id.tag_input);
//-----------------------------------------------------------------------------------------

        Button btn_c1 = findViewById(R.id.btn_c1);
        btn_c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_use = "https://nhentai.net/search/?q=";

                if(button_use == "https://www.wnacg.org/albums-index-tag-") {
                    if (rdogrp_use == null) {
                        if (tag_use == null) {
                            web_url.setText(button_use + ".html");
                        } else {
                            web_url.setText(button_use + tag_use + ".html");
                        }
                    } else {
                        if (tag_use == null) {
                            web_url.setText(button_use + rdogrp_use + ".html");
                        } else {
                            web_url.setText(button_use + rdogrp_use + "+" + tag_use + ".html");
                        }
                    }
                }
                else{
                    if (rdogrp_use == null) {
                        if (tag_use == null) {
                            web_url.setText(button_use);
                        } else {
                            web_url.setText(button_use + tag_use);
                        }
                    } else {
                        if (tag_use == null) {
                            web_url.setText(button_use + rdogrp_use);
                        } else {
                            web_url.setText(button_use + rdogrp_use + "+" + tag_use);
                        }
                    }
                }

            }
        });


        Button btn_c2 = findViewById(R.id.btn_c2);
        btn_c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_use = "https://www.wnacg.org/albums-index-tag-";

                if(button_use == "https://www.wnacg.org/albums-index-tag-") {
                    if (rdogrp_use == null) {
                        if (tag_use == null) {
                            web_url.setText(button_use + ".html");
                        } else {
                            web_url.setText(button_use + tag_use + ".html");
                        }
                    } else {
                        if (tag_use == null) {
                            web_url.setText(button_use + rdogrp_use + ".html");
                        } else {
                            web_url.setText(button_use + rdogrp_use + "+" + tag_use + ".html");
                        }
                    }
                }
                else{
                    if (rdogrp_use == null) {
                        if (tag_use == null) {
                            web_url.setText(button_use);
                        } else {
                            web_url.setText(button_use + tag_use);
                        }
                    } else {
                        if (tag_use == null) {
                            web_url.setText(button_use + rdogrp_use);
                        } else {
                            web_url.setText(button_use + rdogrp_use + "+" + tag_use);
                        }
                    }
                }

            }
        });


        Button btn_c3 = findViewById(R.id.btn_c3);
        btn_c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_use = "https://e-hentai.org/tag/";

                if(button_use == "https://www.wnacg.org/albums-index-tag-") {
                    if (rdogrp_use == null) {
                        if (tag_use == null) {
                            web_url.setText(button_use + ".html");
                        } else {
                            web_url.setText(button_use + tag_use + ".html");
                        }
                    } else {
                        if (tag_use == null) {
                            web_url.setText(button_use + rdogrp_use + ".html");
                        } else {
                            web_url.setText(button_use + rdogrp_use + "+" + tag_use + ".html");
                        }
                    }
                }
                else{
                    if (rdogrp_use == null) {
                        if (tag_use == null) {
                            web_url.setText(button_use);
                        } else {
                            web_url.setText(button_use + tag_use);
                        }
                    } else {
                        if (tag_use == null) {
                            web_url.setText(button_use + rdogrp_use);
                        } else {
                            web_url.setText(button_use + rdogrp_use + "+" + tag_use);
                        }
                    }
                }

            }
        });

//-----------------------------------------------------------------------------------------

        RadioGroup RdoBtnGrp_1 = findViewById(R.id.radioButtonGroup_1);
        RdoBtnGrp_1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioButton_chinese:
                        rdogrp_use = "chinese";

                        if(button_use == "https://www.wnacg.org/albums-index-tag-") {
                            if (rdogrp_use == null) {
                                if (tag_use == null) {
                                    web_url.setText(button_use + ".html");
                                } else {
                                    web_url.setText(button_use + tag_use + ".html");
                                }
                            } else {
                                if (tag_use == null) {
                                    web_url.setText(button_use + rdogrp_use + ".html");
                                } else {
                                    web_url.setText(button_use + rdogrp_use + "+" + tag_use + ".html");
                                }
                            }
                        }
                        else{
                            if (rdogrp_use == null) {
                                if (tag_use == null) {
                                    web_url.setText(button_use);
                                } else {
                                    web_url.setText(button_use + tag_use);
                                }
                            } else {
                                if (tag_use == null) {
                                    web_url.setText(button_use + rdogrp_use);
                                } else {
                                    web_url.setText(button_use + rdogrp_use + "+" + tag_use);
                                }
                            }
                        }

                    break;


                    case R.id.radioButton_japanese:
                        rdogrp_use = "japanese";

                        if(button_use == "https://www.wnacg.org/albums-index-tag-") {
                            if (rdogrp_use == null) {
                                if (tag_use == null) {
                                    web_url.setText(button_use + ".html");
                                } else {
                                    web_url.setText(button_use + tag_use + ".html");
                                }
                            } else {
                                if (tag_use == null) {
                                    web_url.setText(button_use + rdogrp_use + ".html");
                                } else {
                                    web_url.setText(button_use + rdogrp_use + "+" + tag_use + ".html");
                                }
                            }
                        }
                        else{
                            if (rdogrp_use == null) {
                                if (tag_use == null) {
                                    web_url.setText(button_use);
                                } else {
                                    web_url.setText(button_use + tag_use);
                                }
                            } else {
                                if (tag_use == null) {
                                    web_url.setText(button_use + rdogrp_use);
                                } else {
                                    web_url.setText(button_use + rdogrp_use + "+" + tag_use);
                                }
                            }
                        }

                    break;


                    case R.id.radioButton_english:
                        rdogrp_use = "english";

                        if(button_use == "https://www.wnacg.org/albums-index-tag-") {
                            if (rdogrp_use == null) {
                                if (tag_use == null) {
                                    web_url.setText(button_use + ".html");
                                } else {
                                    web_url.setText(button_use + tag_use + ".html");
                                }
                            } else {
                                if (tag_use == null) {
                                    web_url.setText(button_use + rdogrp_use + ".html");
                                } else {
                                    web_url.setText(button_use + rdogrp_use + "+" + tag_use + ".html");
                                }
                            }
                        }
                        else{
                            if (rdogrp_use == null) {
                                if (tag_use == null) {
                                    web_url.setText(button_use);
                                } else {
                                    web_url.setText(button_use + tag_use);
                                }
                            } else {
                                if (tag_use == null) {
                                    web_url.setText(button_use + rdogrp_use);
                                } else {
                                    web_url.setText(button_use + rdogrp_use + "+" + tag_use);
                                }
                            }
                        }

                    break;
                }

            }
        });

//-----------------------------------------------------------------------------------------

        tag_input.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //Log.i(TAG, "输入文字中的状态，count是输入字符数");
                tag_use = tag_input.getText().toString();

                if(button_use == "https://www.wnacg.org/albums-index-tag-") {
                    if (rdogrp_use == null) {
                        if (tag_use == null) {
                            web_url.setText(button_use + ".html");
                        } else {
                            web_url.setText(button_use + tag_use + ".html");
                        }
                    } else {
                        if (tag_use == null) {
                            web_url.setText(button_use + rdogrp_use + ".html");
                        } else {
                            web_url.setText(button_use + rdogrp_use + "+" + tag_use + ".html");
                        }
                    }
                }
                else{
                    if (rdogrp_use == null) {
                        if (tag_use == null) {
                            web_url.setText(button_use);
                        } else {
                            web_url.setText(button_use + tag_use);
                        }
                    } else {
                        if (tag_use == null) {
                            web_url.setText(button_use + rdogrp_use);
                        } else {
                            web_url.setText(button_use + rdogrp_use + "+" + tag_use);
                        }
                    }
                }

            }
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //Log.i(TAG, "输入文本之前的状态");
            }
            @Override
            public void afterTextChanged(Editable s) {
                //Log.i(TAG, "输入文字后的状态");
            }
        });


        Button btn_enter = findViewById(R.id.btn_enter);
        btn_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String web_url_to_web = web_url.getText().toString();

                Intent intent = new Intent(Custom_Search_Activity.this,web_Activity.class);
                //new一個Bundle物件，並將要傳遞的資料傳入
                Bundle bundle = new Bundle();
                bundle.putString("url",web_url_to_web);//傳遞String
                intent.putExtras(bundle);
                startActivity(intent);






            }
        });















        }






    }

