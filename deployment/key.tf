resource "alicloud_ecs_key_pair" "key" {
  key_pair_name   = "key"  
  key_file        = "key.pem"
}